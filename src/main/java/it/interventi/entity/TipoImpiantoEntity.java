package it.interventi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIPO_IMPIANTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoImpiantoEntity {

    @Id
    @Column(name = "ID")
    private Long idTipoImpianto;

    @Column(name = "DESCRIZIONE_TIPO_IMPIANTO", nullable = false)
    private String descrizioneTipoImpianto;
}
