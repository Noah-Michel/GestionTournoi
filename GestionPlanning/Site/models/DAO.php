<?php
require_once(PATH_MODELS.'connexion.php');
abstract class DAO 
{

  private $_erreur; //stocke les messages d'erreurs associées au PDOException
  private $_debug;
  
  public function __construct($debug)
  {
    $this->_debug = $debug;
  }

  public function getErreur()
  {
   return $this->_erreur;
  }

  private function _requete($sql, $args = null)  
  {
    if ($args == null) 
    {
	$pdos = Connexion::getInstance()->getBdd()->query($sql);// exécution directe
    }
    else 
    {
	$pdos = Connexion::getInstance()->getBdd()->prepare($sql);// requête préparée
	$pdos->execute($args);
    }
    return $pdos;
  }
 
  // retourne un tableau 1D avec les données d'un seul enregistrement
  // ou false 
  public function queryRow($sql, $args = null)
  {
	try
	{
		$pdos = $this->_requete($sql, $args);
		$res = $pdos->fetch();
                $pdos->closeCursor();
	}
	catch(PDOException $e)
	{ 
	  if($this->_debug)
            die($e->getMessage());
          $this->_erreur = 'query';
	  $res = false;
	} 
    return $res;
  }
  
  //retourne un tableau 2D avec éventuellement plusieurs enregistrements
  public function queryAll($sql, $args = null)
  {
 	try
	{
		$pdos = $this->_requete($sql, $args);
		$res = $pdos->fetchAll();
                $pdos->closeCursor();
	}
	catch(PDOException $e)
	{ 
	  if($this->_debug)
            die($e->getMessage());
          $this->_erreur = 'query';
	  $res = false;
	} 
    return $res;
  }
}

class TournoiDAO extends DAO
{
    public function getJoueurs1(){
        return $this->queryAll(
          'SELECT nom_Jou, prenom_Jou, rangM_Jou FROM joueur 
          WHERE num_Jou = "J01" OR num_Jou = "J02" OR num_Jou = "J03" OR num_Jou = "J04" OR num_Jou = "J05" OR num_Jou = "J06" OR num_Jou = "J07" OR num_Jou = "J08" OR num_Jou = "J09" OR num_Jou = "J10" OR num_Jou = "J11" OR num_Jou = "J12" OR num_Jou = "J13" OR num_Jou = "J14" OR num_Jou = "J15" OR num_Jou = "J16" 
          ORDER BY RAND()',
          array()
          );
    }

    public function getJoueurs2(){
      return $this->queryAll(
        'SELECT nom_Jou, prenom_Jou, rangM_Jou FROM joueur 
        WHERE num_Jou = "J17" OR num_Jou = "J18" OR num_Jou = "J19" OR num_Jou = "J20" OR num_Jou = "J21" OR num_Jou = "J22" OR num_Jou = "J23" OR num_Jou = "J24" OR num_Jou = "J25" OR num_Jou = "J26" OR num_Jou = "J27" OR num_Jou = "J28" OR num_Jou = "J29" OR num_Jou = "J30" OR num_Jou = "J31" OR num_Jou = "J32" 
        ORDER BY RAND()',
        array()
        );
    }

    public function getMatchs($tournoi, $tour){
      return $this->queryAll(
        'SELECT j1.nom_Jou nom_Jou1, j1.prenom_Jou prenom_Jou1, j1.rangM_Jou rangM_Jou1, j1.num_Jou num_Jou1, j2.nom_Jou nom_Jou2, j2.prenom_Jou prenom_Jou2, j2.rangM_Jou rangM_Jou2, j2.num_Jou num_Jou2 FROM matchs m JOIN joueur j1 on m.`joueur1_Match`=j1.num_Jou JOIN joueur j2 on m.`joueur2_Match`=j2.num_Jou AND num_Tournoi = ? AND num_phase_Match = ?',
        array($tournoi, $tour)
      );
    }

    public function getGagnants($tournoi, $tour){
      return $this->queryAll(
        'SELECT num_Match, gagnant_Match from matchs WHERE num_Tournoi = ? AND num_phase_Match = ?',
        array($tournoi, $tour)
      );
    }

    public function insertMatch($numMacth, $horaire, $date, $numStade, $arbP, $arbS1, $arbS2, $j1, $j2, $gagnant, $numPhase, $numTournoi){
      return $this->queryAll(
        'INSERT INTO matchs (num_Match, horaire_Match, date_Match, num_Stade, arb_principal_Match, arb_secondaire1_Match, arb_secondaire2_Match, joueur1_Match, joueur2_Match, gagnant_Match,num_phase_Match, num_Tournoi) 
        values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)', array($numMacth, $horaire, $date, $numStade, $arbP, $arbS1, $arbS2, $j1, $j2, $gagnant, $numPhase, $numTournoi));
    }

    public function getDates($tournoi, $tour){
      return $this->queryAll(
        'SELECT distinct(date_Match) from matchs m WHERE num_Tournoi = ? AND num_phase_Match = ?',
        array($tournoi, $tour)
      );
    }

    public function getNumStade($stade){
      return $this->queryRow(
        'SELECT num_Stade from stade WHERE num_Stade = ?',
        array($stade)
      );
    }

    public function getJoueurs(){
      return $this->queryAll('SELECT * INTO joueur');
    }
    
    public function getMaxRang(){
      return $this->queryRow('SELECT max(rangM_Jou) INTO joueur');
    }

}