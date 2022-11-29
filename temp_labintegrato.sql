-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Nov 29, 2022 alle 16:04
-- Versione del server: 10.4.21-MariaDB
-- Versione PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `temp_labintegrato`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `data`
--

CREATE TABLE `data` (
  `itter107` varchar(255) NOT NULL,
  `territorio` varchar(255) NOT NULL,
  `tipo_dato7` varchar(255) NOT NULL,
  `indicatori` varchar(255) NOT NULL,
  `correz` varchar(255) NOT NULL,
  `correzione` varchar(255) NOT NULL,
  `tipo_alloggio2` varchar(255) NOT NULL,
  `tipologia_esercizio` varchar(255) NOT NULL,
  `ateco2007` varchar(255) NOT NULL,
  `ateco_2007` varchar(255) NOT NULL,
  `iso` varchar(255) NOT NULL,
  `residenza_clienti` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `periodo` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  `flagcodes` varchar(255) NOT NULL,
  `flags` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `data`
--
ALTER TABLE `data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
