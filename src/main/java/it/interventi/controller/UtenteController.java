package it.interventi.controller;

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
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteService utenteService;

    @GetMapping("/login")
    public String loginPage () {
        return Costants.LinkPages.LOGIN_PAGE;
    }

    @PostMapping("/login")
    public String handleLogin (@RequestParam String username, @RequestParam String password, Model model) {
        if (utenteService.autenticazione(username, password)) {
            // Reindirizza alla dashboard (o pagina principale) in caso di successo
            return Costants.LinkPages.REDIRECT + Costants.LinkPages.HOME_PAGE;
        } else {
            // Aggiungi un messaggio di errore al modello e torna alla pagina di login
            model.addAttribute("errorMessage", Costants.AuthMessage.LOGIN_FAILED_MEX);
            return Costants.LinkPages.LOGIN_PAGE;
        }
    }

}
