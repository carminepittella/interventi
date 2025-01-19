package it.interventi.service;

import it.interventi.dto.TipoImpiantoDto;
import it.interventi.mapper.TipoImpiantoMapper;
import it.interventi.repository.TipoImpiantoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class TipoImpiantoService {

    private final TipoImpiantoRepository tipoImpiantoRepository;
    private final TipoImpiantoMapper tipoImpiantoMapper;

    /*************************** FIND ***************************/

    public List<TipoImpiantoDto> findAllTipiImpianto() {
        return tipoImpiantoMapper.toDtoList(tipoImpiantoRepository.findAll());
    }

    public TipoImpiantoDto findTipoImpiantoById(Long id) {
        if (id == null) return null;
        return tipoImpiantoMapper.toDto(tipoImpiantoRepository.findById(id).orElse(null));
    }
}
