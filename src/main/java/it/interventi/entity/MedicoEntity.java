package it.interventi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MEDICO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoEntity {

    @Id
    @Column(name = "ID")
    private Long idMedico;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "COGNOME", nullable = false)
    private String cognome;
}
