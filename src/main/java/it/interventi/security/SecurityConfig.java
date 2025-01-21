package it.interventi.security;

import it.interventi.utils.costants.Costants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Configura CSRF (puoi personalizzarlo o disattivarlo per test)
                .csrf(AbstractHttpConfigurer::disable)

                // Autorizzazioni per le richieste
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(Costants.LinkPages.LOGIN_PAGE, Costants.LinkPages.REGISTER_PAGE, "/css/**", "/js/**")
                        .permitAll() // Accesso pubblico
                        .anyRequest().authenticated() // Tutte le altre richieste devono essere autenticate
                )

                // Configurazione del form di login
                .formLogin(form -> form
                        .loginPage(Costants.LinkPages.LOGIN_PAGE) // Pagina di login personalizzata
                        .defaultSuccessUrl(Costants.LinkPages.HOME_PAGE, true) // Reindirizza dopo login
                        .failureUrl(Costants.LinkPages.LOGIN_FAILED_PAGE) // In caso di errore
                        .permitAll()
                )

                // Configurazione del logout
                .logout(logout -> logout
                        .logoutUrl("/auth/logout")
                        .logoutSuccessUrl("/auth/login?logout=true")
                        .permitAll()
                );

        return http.build();
    }
}
