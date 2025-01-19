package it.interventi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "INTERVENTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idIntervento;

    @Column(name = "DESCRIZIONE_INTERVENTO", nullable = false)
    private String descrizioneIntervento;

    @Column(name = "DATA_INTERVENTO", nullable = false)
    private Date dataIntervento;

    @ManyToOne
    @JoinColumn(name = "ID_STRUTTURA", nullable = false)
    private StrutturaEntity struttura;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_IMPIANTO", nullable = false)
    private TipoImpiantoEntity tipoImpianto;

    @ManyToOne
    @JoinColumn(name = "ID_MEDICO", nullable = false)
    private MedicoEntity medico;

    @ManyToOne
    @JoinColumn(name = "ID_AZIENDA", nullable = false)
    private AziendaEntity azienda;

    @ManyToOne
    @JoinColumn(name = "ID_SPECIALIST")
    private SpecialistEntity specialist;
}
