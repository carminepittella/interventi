package it.interventi.repository;

import it.interventi.entity.UtenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtenteRepository extends JpaRepository<UtenteEntity, Long> {

    Optional<UtenteEntity> findByUsername (String username);
}
