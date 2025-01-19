package it.interventi.repository;

import it.interventi.entity.SpecialistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialistRepository extends JpaRepository<SpecialistEntity, Long> {
}
