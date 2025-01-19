package it.interventi.service;

import it.interventi.dto.AziendaDto;
import it.interventi.mapper.AziendaMapper;
import it.interventi.repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaMapper aziendaMapper;

    /*************************** FIND ***************************/

    public List<AziendaDto> findAllAziende () {
        return aziendaMapper.toDtoList(aziendaRepository.findAll());
    }

    public AziendaDto findAziendaById (Long id) {
        if (id == null) return null;
        return aziendaMapper.toDto(aziendaRepository.findById(id).orElse(null));
    }




}
