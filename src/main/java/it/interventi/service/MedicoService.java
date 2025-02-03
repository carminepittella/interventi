package it.interventi.service;

import it.interventi.dto.MedicoDto;
import it.interventi.entity.MedicoEntity;
import it.interventi.mapper.MedicoMapper;
import it.interventi.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Log4j2
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;
    private final MedicoMapper medicoMapper;

    /*************************** FIND ***************************/

    public List<MedicoDto> findAllMedici () {
        return medicoMapper.toDtoList(medicoRepository.findAll());
    }

    public MedicoDto findMedicoById (Long id) {
        if (Objects.isNull(id)) return null;
        return medicoMapper.toDto(medicoRepository.findById(id).orElse(null));
    }

    public MedicoDto saveMedico (MedicoDto medicoDto) {
        if (Objects.isNull(medicoDto)) return null;
        MedicoEntity medicoEntity = medicoMapper.toEntity(medicoDto);
        return medicoMapper.toDto(medicoRepository.save(medicoEntity));
    }
}
