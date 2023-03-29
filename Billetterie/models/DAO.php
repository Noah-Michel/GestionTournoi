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
    public function getMatchs($tournoi, $tour, $date){
        return $this->queryAll('SELECT num_Match, j1.nom_Jou nom_Jou1, j1.prenom_Jou prenom_Jou1, j2.nom_Jou nom_Jou2, j2.prenom_Jou prenom_Jou2, date_Match, horaire_Match, num_Phase_Match, m.num_Stade, s.nom_Stade from matchs m JOIN joueur j1 ON m.`joueur1_Match`=j1.num_Jou JOIN joueur j2 ON m.`joueur2_Match`=j2.num_Jou JOIN stade s ON m.num_Stade=s.num_Stade AND num_Tournoi = ? AND num_phase_Match = ? AND date_Match = ?', array($tournoi, $tour, $date));
    }

    public function getDates($tournoi, $tour){
      return $this->queryAll('SELECT distinct(date_Match) from matchs m WHERE num_Tournoi = ? AND num_phase_Match = ?', array($tournoi, $tour));
    }

    public function getStade($stade){
      return $this->queryRow('SELECT * from stade WHERE num_Stade = ?', array($stade));
    }

    public function ajoutCagnotte($tournoi, $montant){
      return $this->queryRow('UPDATE `tournoi` SET `montant_reverse_Tournoi`= `montant_reverse_Tournoi` + ? WHERE `num_Tournoi` = ?', array($montant, $tournoi));
    }
    
    public function getTournois(){
      return $this->queryAll('SELECT * FROM tournoi');
    }
}

class CategorieDAO extends DAO
{
    public function getCategories(){
      return $this->queryAll('SELECT * from categorie ORDER BY num_Categorie');
    }

    public function getCategorie($num){
      return $this->queryRow('SELECT * from categorie WHERE num_Categorie = ?', array($num));
    }

    public function ajoutCategorie($num, $nom, $pourcent, $prix){
      return $this->queryAll('INSERT INTO `categorie` (num_Categorie, nom_Categorie, pourcent_Categorie, prix_Categorie) VALUES (?, ?, ?, ?)', array($num, $nom, $pourcent,$prix));
    }

    public function modifCategorie($num, $nom, $pourcent, $prix){
      return $this->queryRow('UPDATE `categorie` SET `nom_Categorie`= ? ,`pourcent_Categorie`= ?, `prix_Categorie`= ? WHERE num_Categorie = ?', array($nom,$pourcent,$prix,$num));
    }

    public function suppCategorie($num){
      return $this->queryRow('DELETE FROM `categorie` WHERE num_categorie=?', array($num));
    }
}

class BilletDAO extends DAO
{
  public function getBillets(){
    return $this->queryAll('SELECT * FROM billet');
  }

  public function getBilletsMatch(){
    return $this->queryAll('SELECT c.num_Categorie, COUNT(num_billet) as nb_Billet, num_Match FROM billet b Right JOIN categorie c ON b.num_Categorie=c.num_Categorie GROUP BY b.num_Categorie, b.num_Match  ORDER BY c.num_Categorie ');
  }

  public function ajoutBillet($num, $match, $cat){
    return $this->queryRow('INSERT INTO `billet` (num_Billet, num_Match, num_Categorie) VALUES (?, ?, ?)', array($num,$match,$cat));
  }
}