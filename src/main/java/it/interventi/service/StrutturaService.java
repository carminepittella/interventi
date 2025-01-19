package it.interventi.service;

import it.interventi.dto.StrutturaDto;
import it.interventi.mapper.StrutturaMapper;
import it.interventi.repository.StrutturaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class StrutturaService {

    private final StrutturaRepository strutturaRepository;
    private final StrutturaMapper strutturaMapper;

    /*************************** FIND ***************************/

    public List<StrutturaDto> findAllStrutture() {
        return strutturaMapper.toDtoList(strutturaRepository.findAll());
    }

    public StrutturaDto findStrutturaById(Long id) {
        if (id == null) return null;
        return strutturaMapper.toDto(strutturaRepository.findById(id).orElse(null));
    }
}
