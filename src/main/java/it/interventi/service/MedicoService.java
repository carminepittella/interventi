package it.interventi.service;

import it.interventi.dto.MedicoDto;
import it.interventi.mapper.MedicoMapper;
import it.interventi.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;
    private final MedicoMapper medicoMapper;

    /*************************** FIND ***************************/

    public List<MedicoDto> findAllMedici() {
        return medicoMapper.toDtoList(medicoRepository.findAll());
    }

    public MedicoDto findMedicoById(Long id) {
        if (id == null) return null;
        return medicoMapper.toDto(medicoRepository.findById(id).orElse(null));
    }
}
