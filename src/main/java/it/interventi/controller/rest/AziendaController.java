package it.interventi.controller.rest;

import it.interventi.dto.AziendaDto;
import it.interventi.service.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aziende")
@RequiredArgsConstructor
public class AziendaController {

    private final AziendaService aziendaService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<AziendaDto> getAllAziende () {
        return aziendaService.findAllAziende();

    }

}
