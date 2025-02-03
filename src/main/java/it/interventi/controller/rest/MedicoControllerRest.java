package it.interventi.controller.rest;

import it.interventi.dto.MedicoDto;
import it.interventi.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medici")
@RequiredArgsConstructor
public class MedicoControllerRest {

    private final MedicoService medicoService;

    @GetMapping("")
    public ResponseEntity<List<MedicoDto>> getAllMedici () {
        List<MedicoDto> medici = medicoService.findAllMedici();
        return ResponseEntity.ok(medici);
    }

    // GET singolo medico by ID
    @GetMapping("/{id}")
    public ResponseEntity<MedicoDto> getMedicoById (@PathVariable Long id) {
        MedicoDto medico = medicoService.findMedicoById(id);
        if (medico != null) {
            return ResponseEntity.ok(medico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST per creare nuovo medico
    @PostMapping
    public ResponseEntity<MedicoDto> createMedico (@RequestBody MedicoDto medicoDto) {
        MedicoDto savedMedico = medicoService.saveMedico(medicoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMedico);
    }
}