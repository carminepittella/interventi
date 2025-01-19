package it.interventi.controller.auth;

import it.interventi.service.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
@RequiredArgsConstructor
public class registerController {

    private final UtenteService utenteService;

    @PostMapping("")
    public ResponseEntity<String> register (
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String nome,
            @RequestParam String cognome
    ) {
        utenteService.registrazione(username, password, nome, cognome);
        return ResponseEntity.ok("Utente registrato con successo!");
    }
}
