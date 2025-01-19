package it.interventi.service;

import it.interventi.dto.InterventoDto;
import it.interventi.mapper.InterventoMapper;
import it.interventi.repository.InterventoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class InterventoService {

    private final InterventoRepository interventoRepository;
    private final InterventoMapper interventoMapper;

    /*************************** FIND ***************************/

    public List<InterventoDto> findAllInterventi() {
        return interventoMapper.toDtoList(interventoRepository.findAll());
    }

    public InterventoDto findInterventoById(Long id) {
        if (id == null) return null;
        return interventoMapper.toDto(interventoRepository.findById(id).orElse(null));
    }
}
