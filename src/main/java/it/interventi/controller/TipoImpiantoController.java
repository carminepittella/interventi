package it.interventi.controller;

import it.interventi.dto.TipoImpiantoDto;
import it.interventi.service.TipoImpiantoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tipo-impianto")
@RequiredArgsConstructor
public class TipoImpiantoController {

    private final TipoImpiantoService tipoImpiantoService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<TipoImpiantoDto> getAllTipiImpianto() {
        return tipoImpiantoService.findAllTipiImpianto();
    }
}
