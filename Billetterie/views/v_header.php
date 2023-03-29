<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Billetterie</title>
    <link rel="stylesheet" href=<?=PATH_STYLE."style.css"?>>
</head>
<body class="wrap">
<header>
    <a class="btn" href="index.php">Accueil</a>
    <h1><?=ucfirst($page)?></h1>
    <a class="btn" href="index.php?page=admin"><?php 
        if(isset($_SESSION['logged'])){
            if($_SESSION['logged'] == true){
                echo 'Admin';
            }
            else{
                echo 'Login';
            }
        }
        else{
            echo 'Login';
        }
        ?>
        </a>
</header>