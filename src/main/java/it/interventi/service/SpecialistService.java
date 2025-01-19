package it.interventi.service;

import it.interventi.dto.SpecialistDto;
import it.interventi.mapper.SpecialistMapper;
import it.interventi.repository.SpecialistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class SpecialistService {

    private final SpecialistRepository specialistRepository;
    private final SpecialistMapper specialistMapper;

    /*************************** FIND ***************************/

    public List<SpecialistDto> findAllSpecialists() {
        return specialistMapper.toDtoList(specialistRepository.findAll());
    }

    public SpecialistDto findSpecialistById(Long id) {
        if (id == null) return null;
        return specialistMapper.toDto(specialistRepository.findById(id).orElse(null));
    }
}
