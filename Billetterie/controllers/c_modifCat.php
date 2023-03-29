<?php
    require_once(PATH_MODELS.'DAO.php');

    $query = new CategorieDAO(null);

    $categories = $query->getCategories();
    
    if(isset($_POST['nom']) && isset($_POST['pourcentage']) && isset($_POST['prix'])){
        $modif = $query->modifCategorie('C'.sprintf("%02d",$_GET['categorie']+1),stripslashes($_POST['nom']),stripslashes($_POST['pourcentage'])/100, stripslashes($_POST['prix']));
    }

    require_once(PATH_VIEWS.$page.'.php');