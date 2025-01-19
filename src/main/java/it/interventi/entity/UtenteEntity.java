package it.interventi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UTENTE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "COGNOME", nullable = false)
    private String cognome;
}
