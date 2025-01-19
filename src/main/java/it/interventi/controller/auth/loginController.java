package it.interventi.controller.auth;

import it.interventi.service.UtenteService;
import it.interventi.utils.costants.Costants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login")
@RequiredArgsConstructor
public class loginController {

    private final String LOGIN_PAGE = "auth/login";
    private final String HOME_PAGE = "redirect:/home";
    private final String LOGIN_FAILED_PAGE = "redirect:/login?error=true";

    private final UtenteService utenteService;

    @GetMapping("")
    public String loginPage(@RequestParam(required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", Costants.AuthMessage.LOGIN_FAILED_MEX);
        }
        return LOGIN_PAGE; // Restituisce il nome del file login.html nella cartella templates/auth
    }

    @PostMapping("")
    public String login(
            @RequestParam String username,
            @RequestParam String password
    ) {
        return utenteService.findByUsername(username)
                .filter(utente -> utenteService.verificaPassword(password, utente.getPassword()))
                .map(utente -> this.loginSuccess())
                .orElse(this.loginFailed());
    }


    private String loginSuccess() {
        // Salva l'utente nella sessione
        // Puoi utilizzare HttpSession o Spring Security per gestire la sessione
        // Esegui il reindirizzamento alla home
        return HOME_PAGE;
    }

    private String loginFailed() {
        return LOGIN_FAILED_PAGE;
    }
}
