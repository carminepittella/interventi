package it.interventi.controller;

import it.interventi.dto.MedicoDto;
import it.interventi.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medico")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicoService medicoService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<MedicoDto> getAllMedici() {
        return medicoService.findAllMedici();
    }
}
