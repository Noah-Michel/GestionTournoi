-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 18 jan. 2023 à 20:04
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `sae-s3`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbitre`
--

DROP TABLE IF EXISTS `arbitre`;
CREATE TABLE IF NOT EXISTS `arbitre` (
  `num_Arb` varchar(3) NOT NULL,
  `nom_Arb` varchar(50) NOT NULL,
  `prenom_Arb` varchar(50) NOT NULL,
  `sexe_Arb` varchar(1) NOT NULL,
  `nationalite_Arb` varchar(20) NOT NULL,
  PRIMARY KEY (`num_Arb`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `arbitre`
--

INSERT INTO `arbitre` (`num_Arb`, `nom_Arb`, `prenom_Arb`, `sexe_Arb`, `nationalite_Arb`) VALUES
('A01', 'Dubois', 'Thibault', 'M', 'France'),
('A02', 'Moulin', 'Thierry', 'M', 'France'),
('A03', 'Smith', 'John', 'M', 'USA'),
('A04', 'Quantell', 'Glenn', 'M', 'USA'),
('A05', 'Asari', 'Bosho', 'M', 'Japon'),
('A06', 'Uno', 'Denji', 'M', 'Japon'),
('A07', 'Gosto', 'Sidano', 'M', 'Italie'),
('A08', 'Caporaso', 'Livio', 'M', 'Italie'),
('A09', 'Calderer', 'Gregory', 'M', 'Espagne'),
('A10', 'Lluma', 'Felip', 'M', 'Espagne'),
('A11', 'El-Haimer', 'Mohammed', 'M', 'Egypte'),
('A12', 'Hamda', 'Akim', 'M', 'Egypte'),
('A13', 'Fédéré', 'Roger', 'M', 'Suisse'),
('A14', 'Araud', 'Jules', 'M', 'Suisse'),
('A15', 'Berg', 'August', 'M', 'Suède'),
('A16', 'Lind', 'Max', 'M', 'Suède'),
('A17', 'Sharad', 'Kiran', 'M', 'Inde'),
('A18', 'Motilal', 'Anjali', 'M', 'Inde'),
('A19', 'Zhang', 'Ju', 'M', 'Chine'),
('A20', 'Liang', 'Wuying', 'M', 'Chine'),
('A21', 'Kaikura', 'Uys', 'M', 'Afrique Du Sud'),
('A22', 'Christo', 'Goosen', 'M', 'Afrique Du Sud'),
('A23', 'Atilio', 'Gonçalves', 'M', 'Portugal'),
('A24', 'Rodolfo', 'Modiz', 'M', 'Portugal'),
('A25', 'Tommy', 'Himmler', 'M', 'Allemagne'),
('A26', 'Martin', 'Bierwirth', 'M', 'Allemagne'),
('A27', 'Mario', 'Florescu', 'M', 'Roumanie'),
('A28', 'Skender', 'Barnutiu', 'M', 'Roumanie'),
('A29', 'Niels', 'Maes', 'M', 'Belgique'),
('A30', 'Eric', 'Declerk', 'M', 'Belgique'),
('A31', 'Erling', 'Dahl', 'M', 'Danemark'),
('A32', 'Olaf', 'Leth', 'M', 'Danemark');

-- --------------------------------------------------------

--
-- Structure de la table `billet`
--

DROP TABLE IF EXISTS `billet`;
CREATE TABLE IF NOT EXISTS `billet` (
  `num_Billet` varchar(3) DEFAULT NULL,
  `num_Match` varchar(3) DEFAULT NULL,
  `num_Categorie` varchar(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `billet`
--

INSERT INTO `billet` (`num_Billet`, `num_Match`, `num_Categorie`) VALUES
('B01', 'M01', 'C01'),
('B02', 'M01', 'C02'),
('B03', 'M01', 'C01');

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `num_Categorie` varchar(3) NOT NULL,
  `nom_Categorie` varchar(50) NOT NULL,
  `pourcent_Categorie` decimal(2,2) NOT NULL,
  `prix_Categorie` int(3) NOT NULL,
  PRIMARY KEY (`num_Categorie`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`num_Categorie`, `nom_Categorie`, `pourcent_Categorie`, `prix_Categorie`) VALUES
('C01', 'VIP', '0.10', 120),
('C02', 'Base', '0.60', 50),
('C03', 'Low Cost', '0.30', 25);

-- --------------------------------------------------------

--
-- Structure de la table `joueur`
--

DROP TABLE IF EXISTS `joueur`;
CREATE TABLE IF NOT EXISTS `joueur` (
  `num_Jou` varchar(3) NOT NULL,
  `nom_Jou` varchar(50) NOT NULL,
  `prenom_Jou` varchar(50) NOT NULL,
  `sexe_Jou` varchar(1) NOT NULL,
  `nationalite_Jou` varchar(20) NOT NULL,
  `rangM_Jou` int(2) NOT NULL,
  PRIMARY KEY (`num_Jou`),
  UNIQUE KEY `unique_rangM_Jou` (`rangM_Jou`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `joueur`
--

INSERT INTO `joueur` (`num_Jou`, `nom_Jou`, `prenom_Jou`, `sexe_Jou`, `nationalite_Jou`, `rangM_Jou`) VALUES
('J01', 'Hegelbacher', 'Eliot', 'M', 'France', 1),
('J02', 'Mesnard', 'Emrys', 'M', 'France', 2),
('J03', 'Stark', 'Tony', 'M', 'USA', 3),
('J04', 'Wayne', 'Bruce', 'M', 'USA', 4),
('J05', 'Shimada', 'Genji', 'M', 'Japon', 5),
('J06', 'Shimada', 'Hanzo', 'M', 'Japon', 6),
('J07', 'Sauverzac', 'Meurize', 'M', 'Italie', 7),
('J08', 'Dupont', 'Jean', 'M', 'Italie', 8),
('J09', 'Leroy', 'Pierre', 'M', 'Espagne', 9),
('J10', 'Miranda', 'Hugo', 'M', 'Espagne', 10),
('J11', 'Menar', 'Matthias', 'M', 'Egypte', 11),
('J12', 'Perd', 'Florant', 'M', 'Egypte', 12),
('J13', 'Turc', 'Roman', 'M', 'Suisse', 13),
('J14', 'Michel', 'Noah', 'M', 'Suisse', 14),
('J15', 'Richard', 'Elias', 'M', 'Suède', 15),
('J16', 'Praom', 'Alban', 'M', 'Suède', 16),
('J17', 'Jouve', 'Mathieu', 'M', 'Inde', 17),
('J18', 'Curtil', 'Pierre', 'M', 'Inde', 18),
('J19', 'Chi-non', 'Mei', 'M', 'Chine', 19),
('J20', 'Tan-to', 'Shang-Chi', 'M', 'Chine', 20),
('J21', 'Halo', 'Orisa', 'M', 'Afrique du Sud', 21),
('J22', 'Julo', 'Julo', 'M', 'Afrique du Sud', 22),
('J23', 'Fort', 'Lenny', 'M', 'Portugal', 23),
('J24', 'Fornaillo', 'Romain', 'M', 'Portugal', 24),
('J25', 'Leonhart', 'Reinhart', 'M', 'Allemagne', 25),
('J26', 'Lavielle', 'Jonathan', 'M', 'Allemagne', 26),
('J27', 'Miaux', 'Alexis', 'M', 'Roumanie', 27),
('J28', 'Thomas', 'Thibault', 'M', 'Roumanie', 28),
('J29', 'Mirabel', 'Paul', 'M', 'Belgique', 29),
('J30', 'Si', 'Omar', 'M', 'Belgique', 30),
('J31', 'Meurice', 'Guillaume', 'M', 'Danemark', 31),
('J32', 'Dufour', 'Richard', 'M', 'Danemark', 32);

-- --------------------------------------------------------

--
-- Structure de la table `matchs`
--

DROP TABLE IF EXISTS `matchs`;
CREATE TABLE IF NOT EXISTS `matchs` (
  `num_Match` varchar(3) NOT NULL,
  `horaire_Match` varchar(4) NOT NULL,
  `date_Match` varchar(10) NOT NULL,
  `num_Stade` varchar(3) NOT NULL,
  `arb_principal_Match` varchar(3) NOT NULL,
  `arb_secondaire1_Match` varchar(3) NOT NULL,
  `arb_secondaire2_Match` varchar(3) NOT NULL,
  `joueur1_Match` varchar(3) NOT NULL,
  `joueur2_Match` varchar(3) NOT NULL,
  `gagnant_Match` varchar(3) NOT NULL,
  `num_phase_Match` int(1) NOT NULL,
  `num_Tournoi` varchar(3) NOT NULL,
  PRIMARY KEY (`num_Match`),
  KEY `fk_num_Stade` (`num_Stade`),
  KEY `fk_arb_principal_Match` (`arb_principal_Match`),
  KEY `fk_arb_secondaire1_Match` (`arb_secondaire1_Match`),
  KEY `fk_arb_secondaire2_Match` (`arb_secondaire2_Match`),
  KEY `fk_joueur1_Match` (`joueur1_Match`),
  KEY `fk_joueur2_Match` (`joueur2_Match`),
  KEY `fk_num_Tournoi` (`num_Tournoi`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `matchs`
--

INSERT INTO `matchs` (`num_Match`, `horaire_Match`, `date_Match`, `num_Stade`, `arb_principal_Match`, `arb_secondaire1_Match`, `arb_secondaire2_Match`, `joueur1_Match`, `joueur2_Match`, `gagnant_Match`, `num_phase_Match`, `num_Tournoi`) VALUES
('M01', 'Midi', '12/07/2003', 'S01', 'A01', 'A17', 'A09', 'J26', 'J20', 'J20', 1, 'T01'),
('M02', 'Midi', '12/07/2003', 'S02', 'A02', 'A18', 'A10', 'J30', 'J24', 'J24', 1, 'T01'),
('M03', 'Midi', '12/07/2003', 'S03', 'A03', 'A19', 'A11', 'J18', 'J31', 'J18', 1, 'T01'),
('M04', 'Midi', '12/07/2003', 'S04', 'A04', 'A20', 'A12', 'J09', 'J29', 'J09', 1, 'T01'),
('M05', 'Soir', '12/07/2003', 'S01', 'A05', 'A21', 'A13', 'J27', 'J28', 'J27', 1, 'T01'),
('M06', 'Soir', '12/07/2003', 'S02', 'A06', 'A22', 'A14', 'J10', 'J04', 'J04', 1, 'T01'),
('M07', 'Soir', '12/07/2003', 'S03', 'A07', 'A23', 'A15', 'J02', 'J21', 'J02', 1, 'T01'),
('M08', 'Soir', '12/07/2003', 'S04', 'A08', 'A24', 'A16', 'J25', 'J13', 'J13', 1, 'T01'),
('M09', 'Midi', '13/07/2003', 'S01', 'A09', 'A25', 'A01', 'J17', 'J32', 'J17', 1, 'T01'),
('M10', 'Midi', '13/07/2003', 'S02', 'A10', 'A26', 'A02', 'J11', 'J15', 'J11', 1, 'T01'),
('M11', 'Midi', '13/07/2003', 'S03', 'A11', 'A27', 'A03', 'J05', 'J07', 'J05', 1, 'T01'),
('M12', 'Midi', '13/07/2003', 'S04', 'A14', 'A28', 'A04', 'J12', 'J06', 'J06', 1, 'T01'),
('M13', 'Soir', '13/07/2003', 'S01', 'A12', 'A29', 'A05', 'J19', 'J23', 'J19', 1, 'T01'),
('M14', 'Soir', '13/07/2003', 'S02', 'A16', 'A30', 'A06', 'J14', 'J03', 'J03', 1, 'T01'),
('M15', 'Soir', '13/07/2003', 'S03', 'A13', 'A31', 'A07', 'J01', 'J08', 'J01', 1, 'T01'),
('M16', 'Soir', '13/07/2003', 'S04', 'A15', 'A32', 'A08', 'J22', 'J16', 'J16', 1, 'T01'),
('M17', 'Midi', '15/07/2003', 'S01', 'A01', 'A09', 'A17', 'J20', 'J24', 'J20', 2, 'T01'),
('M18', 'Midi', '15/07/2003', 'S02', 'A02', 'A10', 'A18', 'J18', 'J09', 'J09', 2, 'T01'),
('M19', 'Soir', '15/07/2003', 'S03', 'A05', 'A11', 'A19', 'J27', 'J04', 'J04', 2, 'T01'),
('M20', 'Soir', '15/07/2003', 'S04', 'A04', 'A12', 'A20', 'J02', 'J13', 'J02', 2, 'T01'),
('M21', 'Midi', '16/07/2003', 'S01', 'A03', 'A13', 'A21', 'J17', 'J11', 'J11', 2, 'T01'),
('M22', 'Midi', '16/07/2003', 'S02', 'A07', 'A14', 'A22', 'J05', 'J06', 'J05', 2, 'T01'),
('M23', 'Soir', '16/07/2003', 'S03', 'A06', 'A15', 'A23', 'J19', 'J03', 'J03', 2, 'T01'),
('M24', 'Soir', '16/07/2003', 'S04', 'A08', 'A16', 'A24', 'J01', 'J16', 'J01', 2, 'T01'),
('M25', 'Midi', '18/07/2003', 'S05', 'A10', 'A25', 'A29', 'J20', 'J09', 'J09', 3, 'T01'),
('M26', 'Soir', '18/07/2003', 'S05', 'A09', 'A26', 'A30', 'J04', 'J02', 'J02', 3, 'T01'),
('M27', 'Midi', '19/07/2003', 'S05', 'A13', 'A27', 'A31', 'J11', 'J05', 'J05', 3, 'T01'),
('M28', 'Soir', '19/07/2003', 'S05', 'A11', 'A28', 'A32', 'J03', 'J01', 'J01', 3, 'T01'),
('M29', 'Midi', '21/07/2003', 'S06', 'A15', 'A28', 'A30', 'J09', 'J02', 'J02', 4, 'T01'),
('M30', 'Soir', '21/07/2003', 'S06', 'A16', 'A29', 'A31', 'J05', 'J01', 'J01', 4, 'T01'),
('M31', 'Midi', '23/07/2003', 'S06', 'A17', 'A19', 'A21', 'J02', 'J01', 'J01', 5, 'T01'),
('M32', 'Soir', '23/07/2003', 'S06', 'A18', 'A20', 'A22', 'J09', 'J05', 'J05', 5, 'T01');

-- --------------------------------------------------------

--
-- Structure de la table `stade`
--

DROP TABLE IF EXISTS `stade`;
CREATE TABLE IF NOT EXISTS `stade` (
  `num_Stade` varchar(3) NOT NULL,
  `nom_Stade` varchar(50) NOT NULL,
  `nb_Places_Stade` int(3) NOT NULL,
  PRIMARY KEY (`num_Stade`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `stade`
--

INSERT INTO `stade` (`num_Stade`, `nom_Stade`, `nb_Places_Stade`) VALUES
('S01', 'Cours de la Raquette', 500),
('S02', 'Cours du Jeu de Balle ', 500),
('S03', 'Cours du Bout de Filet', 500),
('S04', 'Cours du Service', 500),
('S05', 'Cour Central Bis', 1000),
('S06', 'Cour Central', 2000);

-- --------------------------------------------------------

--
-- Structure de la table `tournoi`
--

DROP TABLE IF EXISTS `tournoi`;
CREATE TABLE IF NOT EXISTS `tournoi` (
  `num_Tournoi` varchar(3) NOT NULL,
  `nom_Tournoi` varchar(100) NOT NULL,
  `annee_Tournoi` int(4) NOT NULL,
  `vainqueur_Tournoi` varchar(3) DEFAULT NULL,
  `nom_asso_Tournoi` varchar(100) NOT NULL,
  `montant_reverse_Tournoi` int(6) NOT NULL,
  PRIMARY KEY (`num_Tournoi`),
  KEY `fk_vainqueur_Tournoi` (`vainqueur_Tournoi`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `tournoi`
--

INSERT INTO `tournoi` (`num_Tournoi`, `nom_Tournoi`, `annee_Tournoi`, `vainqueur_Tournoi`, `nom_asso_Tournoi`, `montant_reverse_Tournoi`) VALUES
('T01', 'Nom', 2022, 'J01', 'Asso', 21070);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
