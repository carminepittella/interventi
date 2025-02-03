package it.interventi.service;

import it.interventi.dto.UtenteDto;
import it.interventi.mapper.UtenteMapper;
import it.interventi.repository.UtenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtenteService {

    private final UtenteRepository utenteRepository;
    private final UtenteMapper utenteMapper;


    public Optional<UtenteDto> findByUsername (String username) {
        return utenteRepository.findByUsername(username)
                .map(utenteMapper::toDto);
    }
}
