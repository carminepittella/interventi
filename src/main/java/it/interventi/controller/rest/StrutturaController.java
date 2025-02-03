package it.interventi.controller.rest;

import it.interventi.dto.StrutturaDto;
import it.interventi.service.StrutturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/strutture")
@RequiredArgsConstructor
public class StrutturaController {

    private final StrutturaService strutturaService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<StrutturaDto> getAllStrutture() {
        return strutturaService.findAllStrutture();
    }
}
