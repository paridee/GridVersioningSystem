-- phpMyAdmin SQL Dump
-- version 4.4.13.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Dic 25, 2015 alle 12:39
-- Versione del server: 5.6.27-0ubuntu1
-- Versione PHP: 5.6.11-1ubuntu3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gvs`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `Goal`
--

CREATE TABLE IF NOT EXISTS `Goal` (
  `assumption` text,
  `description` text,
  `context` text,
  `id` int(11) NOT NULL,
  `label` text NOT NULL,
  `version` int(11) NOT NULL,
  `measurementGoal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Goal`
--

INSERT INTO `Goal` (`assumption`, `description`, `context`, `id`, `label`, `version`, `measurementGoal`) VALUES
('', 'pippogoal', '', 1, 'goal1', 10, NULL),
('', 'pippogoal', '', 32768, 'goal1', 10, NULL),
('', 'pippogoal', '', 65536, 'goal1', 10, NULL),
('', 'pippogoal', '', 65538, 'goal1', 10, 65541),
('', 'pippogoal', '', 98304, 'goal1', 10, NULL),
('', 'pippogoal', '', 98306, 'goal1', 10, 98308),
('', 'pippogoal', '', 196608, 'goal1', 1, NULL),
('', 'pippogoal', '', 196610, 'goal1', 1, 196612),
('', 'pippogoal', '', 262144, 'goal1', 1, NULL),
('', 'pippogoal', '', 262146, 'goal1', 1, 262148),
('', 'pippogoal', '', 262150, 'goal1', 2, 262148),
('', 'pippogoal', '', 294912, 'goal1', 1, NULL),
('', 'pippogoal', '', 294914, 'goal1', 1, 294916),
('', 'pippogoal', '', 294918, 'goal1', 2, 294916),
('', 'pippogoal', '', 393216, 'goal1', 1, NULL),
('', 'pippogoal', '', 393218, 'goal1', 1, 393220),
('', 'pippogoal', '', 393222, 'goal1', 2, 393220),
('', 'pippogoal', '', 425984, 'goal1', 1, NULL),
('', 'pippogoal', '', 425986, 'goal1', 1, 425988),
('', 'pippogoal', '', 425990, 'goal1', 2, 425988),
('', 'pippogoal', '', 491520, 'goal1', 1, NULL),
('', 'pippogoal', '', 491521, 'goal1', 1, 491524),
('', 'pippogoal', '', 491526, 'goal1', 2, 491524);

-- --------------------------------------------------------

--
-- Struttura della tabella `GoalToStrategyList`
--

CREATE TABLE IF NOT EXISTS `GoalToStrategyList` (
  `goalID` int(11) NOT NULL,
  `strID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `GoalToStrategyList`
--

INSERT INTO `GoalToStrategyList` (`goalID`, `strID`) VALUES
(753665, 753664),
(786433, 786432),
(819201, 819200),
(851969, 851968),
(65538, 65537),
(98306, 98307),
(196610, 196611),
(262146, 262147),
(262150, 262147),
(294914, 294915),
(294918, 294915),
(393218, 393219),
(393222, 393219),
(425986, 425987),
(425990, 425987),
(491521, 491523),
(491526, 491523);

-- --------------------------------------------------------

--
-- Struttura della tabella `Grid`
--

CREATE TABLE IF NOT EXISTS `Grid` (
  `id` int(11) NOT NULL,
  `version` int(10) NOT NULL,
  `projID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Grid`
--

INSERT INTO `Grid` (`id`, `version`, `projID`) VALUES
(65536, 1, 32768),
(98304, 1, 65536),
(163840, 1, 131072);

-- --------------------------------------------------------

--
-- Struttura della tabella `GridToRootGoal`
--

CREATE TABLE IF NOT EXISTS `GridToRootGoal` (
  `gridID` int(11) NOT NULL,
  `goalID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `GridToRootGoal`
--

INSERT INTO `GridToRootGoal` (`gridID`, `goalID`) VALUES
(163840, 491521);

-- --------------------------------------------------------

--
-- Struttura della tabella `hibernate_sequences`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequences` (
  `sequence_name` varchar(255) DEFAULT NULL,
  `sequence_next_hi_value` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `hibernate_sequences`
--

INSERT INTO `hibernate_sequences` (`sequence_name`, `sequence_next_hi_value`) VALUES
('GridEntity', 28),
('GridElement', 16),
('Grid', 6),
('Project', 5);

-- --------------------------------------------------------

--
-- Struttura della tabella `MeasurementGoal`
--

CREATE TABLE IF NOT EXISTS `MeasurementGoal` (
  `id` int(11) NOT NULL,
  `label` text NOT NULL,
  `version` int(11) NOT NULL,
  `description` text,
  `interpretationModel` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `MeasurementGoal`
--

INSERT INTO `MeasurementGoal` (`id`, `label`, `version`, `description`, `interpretationModel`) VALUES
(196612, 'mg1', 1, 'pippoMgoal', ''),
(262148, 'mg1', 1, 'pippoMgoal', ''),
(294916, 'mg1', 1, 'pippoMgoal', ''),
(393220, 'mg1', 1, 'pippoMgoal', ''),
(425988, 'mg1', 1, 'pippoMgoal', ''),
(491524, 'mg1', 1, 'pippoMgoal', '');

-- --------------------------------------------------------

--
-- Struttura della tabella `MeasurementGoalToQuestion`
--

CREATE TABLE IF NOT EXISTS `MeasurementGoalToQuestion` (
  `goalID` int(11) NOT NULL,
  `quesID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `Metric`
--

CREATE TABLE IF NOT EXISTS `Metric` (
  `count` int(11) DEFAULT NULL,
  `description` text,
  `measurementProcess` text,
  `metricType` text,
  `scaleType` text,
  `label` text NOT NULL,
  `id` int(11) NOT NULL,
  `version` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Metric`
--

INSERT INTO `Metric` (`count`, `description`, `measurementProcess`, `metricType`, `scaleType`, `label`, `id`, `version`) VALUES
(0, 'pippo', '', '', '', 'metric1', 196609, 1),
(0, 'pippo', '', '', '', 'metric1', 262145, 1),
(0, 'pippo', '', '', '', 'metric1', 294913, 1),
(0, 'pippo', '', '', '', 'metric1', 393217, 1),
(0, 'pippo', '', '', '', 'metric1', 425985, 1),
(0, 'pippo', '', '', '', 'metric1', 491522, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `MetricMeasUnits`
--

CREATE TABLE IF NOT EXISTS `MetricMeasUnits` (
  `metrID` int(11) NOT NULL,
  `measUnit` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `Project`
--

CREATE TABLE IF NOT EXISTS `Project` (
  `id` int(11) NOT NULL,
  `projectId` text,
  `description` text,
  `creationDate` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Project`
--

INSERT INTO `Project` (`id`, `projectId`, `description`, `creationDate`) VALUES
(32768, NULL, 'mannaggia il bambinello', NULL),
(65536, NULL, 'mannaggia il bambinello', NULL),
(131072, NULL, 'mannaggia il bambinello', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `Question`
--

CREATE TABLE IF NOT EXISTS `Question` (
  `id` int(11) NOT NULL,
  `label` text NOT NULL,
  `version` int(11) NOT NULL,
  `question` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Question`
--

INSERT INTO `Question` (`id`, `label`, `version`, `question`) VALUES
(196613, 'qu1', 1, NULL),
(262149, 'qu1', 1, NULL),
(294917, 'qu1', 1, NULL),
(393221, 'qu1', 1, NULL),
(425989, 'qu1', 1, NULL),
(491525, 'qu1', 1, NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `QuestionToMetric`
--

CREATE TABLE IF NOT EXISTS `QuestionToMetric` (
  `quesID` int(11) NOT NULL,
  `metrID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `Strategy`
--

CREATE TABLE IF NOT EXISTS `Strategy` (
  `id` int(11) NOT NULL,
  `version` int(11) NOT NULL,
  `label` text NOT NULL,
  `description` text,
  `isTerminal` tinyint(1) NOT NULL,
  `strategicProjectId` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Strategy`
--

INSERT INTO `Strategy` (`id`, `version`, `label`, `description`, `isTerminal`, `strategicProjectId`) VALUES
(196611, 1, 'str1', NULL, 0, NULL),
(262147, 1, 'str1', NULL, 0, NULL),
(294915, 1, 'str1', NULL, 0, NULL),
(393219, 1, 'str1', NULL, 0, NULL),
(425987, 1, 'str1', NULL, 0, NULL),
(491523, 1, 'str1', NULL, 0, NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `StrategyToGoalList`
--

CREATE TABLE IF NOT EXISTS `StrategyToGoalList` (
  `strID` int(11) NOT NULL,
  `goalID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `Goal`
--
ALTER TABLE `Goal`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `Grid`
--
ALTER TABLE `Grid`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `Metric`
--
ALTER TABLE `Metric`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `Project`
--
ALTER TABLE `Project`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `Question`
--
ALTER TABLE `Question`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `Strategy`
--
ALTER TABLE `Strategy`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
