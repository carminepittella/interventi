package it.interventi.controller.rest;

import it.interventi.dto.InterventoDto;
import it.interventi.service.InterventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/interventi")
@RequiredArgsConstructor
public class InterventoControllerRest {

    private final InterventoService interventoService;

    /*----------------------------- GET -----------------------------*/

    @GetMapping("")
    public ResponseEntity<List<InterventoDto>> getAllInterventi () {
        List<InterventoDto> interventiList = interventoService.findAllInterventi();
        return ResponseEntity.ok(interventiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InterventoDto> getInterventoById (@RequestParam Long id) {
        InterventoDto interventoDto = interventoService.findInterventoById(id);
        if (Objects.nonNull(interventoDto)) {
            return ResponseEntity.ok(interventoDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*----------------------------- POST -----------------------------*/
}

