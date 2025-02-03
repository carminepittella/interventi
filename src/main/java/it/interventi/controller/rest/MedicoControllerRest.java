package it.interventi.controller.rest;

import it.interventi.dto.MedicoDto;
import it.interventi.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/medici")
@RequiredArgsConstructor
public class MedicoControllerRest {

    private final MedicoService medicoService;

    /*----------------------------- GET -----------------------------*/

    @GetMapping("")
    public ResponseEntity<List<MedicoDto>> getAllMedici () {
        List<MedicoDto> mediciList = medicoService.findAllMedici();
        return ResponseEntity.ok(mediciList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoDto> getMedicoById (@PathVariable Long id) {
        MedicoDto medicoDto = medicoService.findMedicoById(id);
        if (Objects.nonNull(medicoDto)) {
            return ResponseEntity.ok(medicoDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*----------------------------- POST -----------------------------*/

    @PostMapping
    public ResponseEntity<MedicoDto> createMedico (@RequestBody MedicoDto medicoDto) {
        MedicoDto savedMedico = medicoService.saveMedico(medicoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMedico);
    }
}