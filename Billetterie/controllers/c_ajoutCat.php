<?php
if (isset($_POST['nom']) && isset($_POST['pourcentage'])){
    
    require_once(PATH_MODELS.'DAO.php');

    $query = new CategorieDAO(null);

    $nombreCat = sprintf("%02d", count($query->getCategories())+1);

    $ajout = $query->ajoutCategorie('C'.$nombreCat,stripslashes($_POST['nom']),stripslashes($_POST['pourcentage'])/100, stripslashes($_POST['prix']));

}
require_once(PATH_VIEWS.$page.'.php');
?>