package it.interventi.dto;

import it.interventi.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class InterventoDto {

    private Long idIntervento;
    private String descrizioneIntervento;
    private Date dataIntervento;
    private StrutturaEntity struttura;
    private TipoImpiantoEntity tipoImpianto;
    private MedicoEntity medico;
    private AziendaEntity azienda;
    private SpecialistEntity specialist;
}
