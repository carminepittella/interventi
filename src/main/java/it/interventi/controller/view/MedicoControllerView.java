package it.interventi.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medici")
public class MedicoControllerView {
    // Endpoint che ritorna una vista HTML
    @GetMapping
    public String getPage() {
        return "medici"; // Cerca medici.html in templates/
    }
}