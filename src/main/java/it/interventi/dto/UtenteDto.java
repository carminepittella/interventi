package it.interventi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UtenteDto {

    private Long id;
    private String username;
    private String password;
    private String nome;
    private String cognome;
}
