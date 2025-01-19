package it.interventi.repository;

import it.interventi.entity.InterventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventoRepository extends JpaRepository<InterventoEntity, Long> {
}
