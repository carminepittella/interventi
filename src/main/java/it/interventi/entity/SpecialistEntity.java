package it.interventi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SPECIALIST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecialistEntity {

    @Id
    @Column(name = "ID")
    private Long idSpecialist;

    @Column(name = "SPECIALISTA", nullable = false)
    private String specialista;
}
