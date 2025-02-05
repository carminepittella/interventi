package it.interventi.controller.view;

import it.interventi.dto.InterventoDto;
import it.interventi.service.InterventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interventi")
@RequiredArgsConstructor
public class InterventoControllerView {

    private final InterventoService interventoService;

    @GetMapping
    public String getHomePage () {
        return "interventi";
    }

    @GetMapping("/{id}")
    public String getInterventoDetail(@PathVariable Long id, Model model) {
        InterventoDto intervento = interventoService.findInterventoById(id);
        model.addAttribute("intervento", intervento);
        return "dettaglio-intervento";
    }
}
