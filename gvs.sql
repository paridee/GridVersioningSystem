-- phpMyAdmin SQL Dump
-- version 4.4.13.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Dic 24, 2015 alle 11:17
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
  `version` text NOT NULL,
  `measurementGoal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Goal`
--

INSERT INTO `Goal` (`assumption`, `description`, `context`, `id`, `label`, `version`, `measurementGoal`) VALUES
('', 'pippogoal', '', 196608, 'goal1', '1.0.0', 0),
('', 'pippogoal', '', 229376, 'goal1', '1.0.0', 0),
('', 'pippoMgoal', '', 262144, 'mg1', '1.0.0', 0),
('', 'pippoMgoal', '', 294912, 'mg1', '1.0.0', 0),
('', 'pippogoal', '', 425984, 'goal1', '1.0.0', 0),
('', 'pippogoal', '', 557057, 'goal1', '1.0.0', 557060),
('', 'pippogoal', '', 589825, 'goal1', '1.0.0', 589828),
('', 'pippogoal', '', 622593, 'goal1', '1.0.0', 622596),
('', 'pippogoal', '', 720897, 'goal1', '1.0.0', 720900),
('', 'pippogoal', '', 753665, 'goal1', '1.0.0', 753668),
('', 'pippogoal', '', 786433, 'goal1', '1.0.0', 786436),
('', 'pippogoal', '', 819201, 'goal1', '1.0.0', 819204);

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
(819201, 819200);

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
('GridEntity', 26);

-- --------------------------------------------------------

--
-- Struttura della tabella `MeasurementGoal`
--

CREATE TABLE IF NOT EXISTS `MeasurementGoal` (
  `id` int(11) NOT NULL,
  `label` text NOT NULL,
  `version` text NOT NULL,
  `description` text,
  `interpretationModel` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `MeasurementGoal`
--

INSERT INTO `MeasurementGoal` (`id`, `label`, `version`, `description`, `interpretationModel`) VALUES
(425986, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(557060, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(589828, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(622596, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(720900, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(753668, 'mg1', '1.0.0', 'pippoMgoal', NULL),
(786436, 'mg1', '1.0.0', 'pippoMgoal', ''),
(819204, 'mg1', '1.0.0', 'pippoMgoal', '');

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
  `version` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Metric`
--

INSERT INTO `Metric` (`count`, `description`, `measurementProcess`, `metricType`, `scaleType`, `label`, `id`, `version`) VALUES
(0, 'pippo', NULL, NULL, NULL, 'goal1', 1, '1.0.0'),
(0, 'pippo', NULL, NULL, NULL, 'goal1', 32768, '1.0.0'),
(0, 'pippo', NULL, NULL, NULL, 'goal1', 65536, '1.0.0'),
(0, 'pippogoal', '', '', '', 'goal1', 98304, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 196609, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 229377, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 262145, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 294913, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 425985, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 557059, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 589827, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 622595, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 720899, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 753667, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 786435, '1.0.0'),
(0, 'pippo', '', '', '', 'metric1', 819203, '1.0.0');

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
-- Struttura della tabella `Question`
--

CREATE TABLE IF NOT EXISTS `Question` (
  `id` int(11) NOT NULL,
  `label` text NOT NULL,
  `version` text NOT NULL,
  `question` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Question`
--

INSERT INTO `Question` (`id`, `label`, `version`, `question`) VALUES
(557058, 'qu1', '1.0.0', NULL),
(589826, 'qu1', '1.0.0', NULL),
(622594, 'qu1', '1.0.0', NULL),
(720898, 'qu1', '1.0.0', NULL),
(753666, 'qu1', '1.0.0', NULL),
(786434, 'qu1', '1.0.0', NULL),
(819202, 'qu1', '1.0.0', NULL);

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
  `version` text NOT NULL,
  `label` text NOT NULL,
  `description` text,
  `isTerminal` tinyint(1) NOT NULL,
  `strategicProjectId` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `Strategy`
--

INSERT INTO `Strategy` (`id`, `version`, `label`, `description`, `isTerminal`, `strategicProjectId`) VALUES
(557056, '1.0.0', 'str1', NULL, 0, NULL),
(589824, '1.0.0', 'str1', NULL, 0, NULL),
(622592, '1.0.0', 'str1', NULL, 1, NULL),
(720896, '1.0.0', 'str1', NULL, 0, NULL),
(753664, '1.0.0', 'str1', NULL, 0, NULL),
(786432, '1.0.0', 'str1', NULL, 0, NULL),
(819200, '1.0.0', 'str1', NULL, 0, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
