package it.interventi.controller.rest;

import it.interventi.dto.InterventoDto;
import it.interventi.service.InterventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/interventi")
@RequiredArgsConstructor
public class InterventoController {

    private final InterventoService interventoService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<InterventoDto> getAllInterventi() {
        return interventoService.findAllInterventi();
    }
}
