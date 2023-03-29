<?php
require_once(PATH_MODELS.'DAO.php');

$query = new CategorieDAO(null);
$categories = $query->getCategories();

if(isset($_GET['categorie'])){
    $supp = $query->suppCategorie('C'.sprintf("%02d",$_GET['categorie']));
}

require_once(PATH_VIEWS.$page.'.php');