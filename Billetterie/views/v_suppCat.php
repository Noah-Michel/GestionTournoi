<?php require_once(PATH_VIEWS.'header.php');?>

<?php if(isset($supp)){?>

<h2>Modifaction effectué</h2>
    
<?php }
else{ ?>
<div class="cartes">
<?php for($i=0; $i<count($categories); $i++){?>
        <a href="index.php?page=suppCat&categorie=<?php echo $i?>">
        <h3><?php print_r($categories[$i]['nom_Categorie']);?></h3>
        <p>Pourcentage de places : <?php print_r($categories[$i]['pourcent_Categorie']);?></p>
        <p>Prix des places : <?php print_r($categories[$i]['prix_Categorie']);?> €</p>
        </a>
<?php } ?>
</div>
<?php } require_once(PATH_VIEWS.'footer.php');?>