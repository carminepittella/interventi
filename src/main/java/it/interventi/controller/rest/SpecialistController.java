package it.interventi.controller.rest;

import it.interventi.dto.SpecialistDto;
import it.interventi.service.SpecialistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/specialist")
@RequiredArgsConstructor
public class SpecialistController {

    private final SpecialistService specialistService;

    /**************************** GET ****************************/

    @GetMapping("")
    private List<SpecialistDto> getAllSpecialists() {
        return specialistService.findAllSpecialists();
    }
}
