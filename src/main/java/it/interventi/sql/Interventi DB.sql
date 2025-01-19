-- Database: Interventi
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS interventi;
USE interventi;

DROP USER IF EXISTS 'danilo'@'localhost';
CREATE USER 'danilo'@'localhost' IDENTIFIED BY 'danilo';
GRANT ALL ON `interventi`.* TO 'danilo'@'localhost';

-- Utente
CREATE TABLE IF NOT EXISTS Utente (
                                      ID INT PRIMARY KEY AUTO_INCREMENT,
                                      username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(512) NOT NULL
    );

-- Struttura
CREATE TABLE IF NOT EXISTS Struttura (
                                         ID INT PRIMARY KEY AUTO_INCREMENT,
                                         nome_struttura VARCHAR(128) NOT NULL UNIQUE
    );

-- Medico
CREATE TABLE IF NOT EXISTS Medico (
                                      ID INT PRIMARY KEY AUTO_INCREMENT,
                                      nome VARCHAR(50) NOT NULL,
    cognome VARCHAR(50) NOT NULL,
    UNIQUE (nome, cognome)
    );

-- Tipo_impianto
CREATE TABLE IF NOT EXISTS Tipo_impianto (
                                             ID INT PRIMARY KEY AUTO_INCREMENT,
                                             descrizione_tipo_impianto VARCHAR(256) NOT NULL UNIQUE
    );

-- Azienda
CREATE TABLE IF NOT EXISTS Azienda (
                                       ID INT PRIMARY KEY AUTO_INCREMENT,
                                       nome_azienda VARCHAR(256) NOT NULL UNIQUE
    );

-- Specialist
CREATE TABLE IF NOT EXISTS Specialist (
                                          ID INT PRIMARY KEY AUTO_INCREMENT,
                                          specialista VARCHAR(128) NOT NULL UNIQUE
    );

-- Intervento
CREATE TABLE IF NOT EXISTS Intervento (
                                          ID INT PRIMARY KEY AUTO_INCREMENT,
                                          descrizione_intervento VARCHAR(256) NOT NULL,
    data_intervento DATE NOT NULL,
    id_struttura INT NOT NULL,
    id_tipo_impianto INT NOT NULL,
    id_medico INT NOT NULL,
    id_azienda INT NOT NULL,
    id_specialist INT,
    FOREIGN KEY (id_struttura) REFERENCES Struttura(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
    FOREIGN KEY (id_tipo_impianto) REFERENCES Tipo_impianto(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
    FOREIGN KEY (id_medico) REFERENCES Medico(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
    FOREIGN KEY (id_azienda) REFERENCES Azienda(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
    FOREIGN KEY (id_specialist) REFERENCES Specialist(ID) ON DELETE NO ACTION ON UPDATE CASCADE
    );

COMMIT;