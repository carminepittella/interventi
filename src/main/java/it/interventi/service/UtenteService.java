package it.interventi.service;

import it.interventi.dto.UtenteDto;
import it.interventi.mapper.UtenteMapper;
import it.interventi.repository.UtenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtenteService {

    private final UtenteRepository utenteRepository;
    private final PasswordEncoder passwordEncoder;
    private final UtenteMapper utenteMapper;

    public UtenteDto registrazione (String username, String password, String nome, String cognome) {
        if (this.findByUsername(username).isPresent()) {
            //gestisci eccezione
        }
        UtenteDto nuovoUtente = UtenteDto.builder()
                .username(username)
                .password(passwordEncoder.encode(password)) // Criptazione password
                .nome(nome)
                .cognome(cognome)
                .build();
        return utenteMapper.toDto(utenteRepository.save(utenteMapper.toEntity(nuovoUtente)));
    }

    public Optional<UtenteDto> findByUsername (String username) {
        return utenteRepository.findByUsername(username)
                .map(utenteMapper::toDto);
    }

    public boolean autenticazione (String username, String password) {
        return this.findByUsername(username)
                .map(utente -> this.verificaPassword(password, utente.getPassword()))
                .orElse(false);
    }

    public boolean verificaPassword (String manualPassword, String cryptPassword) {
        return passwordEncoder.matches(manualPassword, cryptPassword);
    }


}
