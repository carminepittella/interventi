package it.interventi.repository;

import it.interventi.entity.AziendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AziendaRepository extends JpaRepository<AziendaEntity, Long> {
}
