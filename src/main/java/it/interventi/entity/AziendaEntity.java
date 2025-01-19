package it.interventi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "AZIENDA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AziendaEntity {

    @Id
    @Column(name = "ID")
    private Long idAzienda;

    @Column(name = "NOME_AZIENDA", nullable = false)
    private String nomeAzienda;
}
