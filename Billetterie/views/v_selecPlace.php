<?php require_once(PATH_VIEWS.'header.php');?>
<div class="cartes">
<?php
    for($i = 0; $i<count($categories); $i++){
        for($j = 0; $j<count($billets); $j++){
            if($billets[$j]['num_Match']==$_SESSION['match'] && $billets[$j]['num_Categorie']==$categories[$i]['num_Categorie']){
                $bonBillets = $billets[$j];
            }
        }
        if($places * $categories[$i]['pourcent_Categorie'] - $bonBillets['nb_Billet'] <= 0){?>
            <a class="inactif" href='index.php?page=recapCmd&match=<?php echo $_GET['match']?>&cat=<?php echo $categories[$i]['num_Categorie']?>' >
<?php } else{
    ?>
        <a href='index.php?page=recapCmd&match=<?php echo $_GET['match']?>&cat=<?php echo $categories[$i]['num_Categorie']?>'>
    <?php }?>
        <h2><?=$categories[$i]['nom_Categorie']?></h2>
        <p>Nombre de places : <?php 
        
            if($bonBillets['num_Match'] == $_SESSION['match'] && $bonBillets['num_Categorie']==$categories[$i]['num_Categorie']){
                echo $places * $categories[$i]['pourcent_Categorie'] - $bonBillets['nb_Billet'];
            }else{
                echo $places * $categories[$i]['pourcent_Categorie'];
            }

        
        ?></p>
        <p>Prix de la place : <?=$categories[$i]['prix_Categorie']?></p>
        </a>
<?php
}
?>
</div>
<?php require_once(PATH_VIEWS.'footer.php');?>