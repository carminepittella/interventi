package it.interventi.repository;

import it.interventi.entity.TipoImpiantoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoImpiantoRepository extends JpaRepository<TipoImpiantoEntity, Long> {
}
