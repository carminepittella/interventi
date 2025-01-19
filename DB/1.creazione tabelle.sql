CREATE TABLE `azienda` (
  `ID` BIGINT PRIMARY KEY,
  `nome_azienda` VARCHAR(256) UNIQUE NOT NULL
);

CREATE TABLE `intervento` (
  `ID` BIGINT PRIMARY KEY,
  `descrizione_intervento` VARCHAR(256) NOT NULL,
  `data_intervento` DATE NOT NULL,
  `id_struttura` BIGINT NOT NULL,
  `id_tipo_impianto` BIGINT NOT NULL,
  `id_medico` BIGINT NOT NULL,
  `id_azienda` BIGINT NOT NULL,
  `id_specialist` BIGINT DEFAULT NULL
);

CREATE TABLE `medico` (
  `ID` BIGINT PRIMARY KEY,
  `nome` VARCHAR(50) NOT NULL,
  `cognome` VARCHAR(50) NOT NULL,
  UNIQUE (nome, cognome)
);

CREATE TABLE `specialist` (
  `ID` BIGINT PRIMARY KEY,
  `specialista` VARCHAR(128) UNIQUE NOT NULL
);

CREATE TABLE `struttura` (
  `ID` BIGINT PRIMARY KEY,
  `nome_struttura` VARCHAR(128) UNIQUE NOT NULL
);

CREATE TABLE `tipo_impianto` (
  `ID` BIGINT PRIMARY KEY,
  `descrizione_tipo_impianto` VARCHAR(256) UNIQUE NOT NULL
);

CREATE TABLE `utente` (
  `ID` BIGINT PRIMARY KEY,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(512) NOT NULL
);