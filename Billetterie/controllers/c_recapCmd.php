<?php
require_once(PATH_MODELS.'DAO.php');
$query = new CategorieDAO(null);
$_SESSION['categorie'] = $query->getCategorie($_GET['cat']);
require_once(PATH_VIEWS."recapCmd.php");