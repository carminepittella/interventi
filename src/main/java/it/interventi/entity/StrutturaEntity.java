package it.interventi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STRUTTURA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StrutturaEntity {

    @Id
    @Column(name = "ID")
    private Long idStruttura;

    @Column(name = "NOME_STRUTTURA", nullable = false)
    private String nomeStruttura;


}
