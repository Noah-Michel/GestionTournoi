<?php require_once(PATH_VIEWS.'header.php');?>

<?php if(isset($modif)){?>

<h2>Modifaction effectué</h2>
    
<?php }else{?>

<h2>Choissisez la catégorie que vous souhaitez modifier</h2>

<?php if(isset($_GET['categorie'])){?>
<form action="" method="post">
  
    <input type="text" name="nom" value="<?php print_r($categories[$_GET['categorie']]['nom_Categorie']);?>" required />

    <input type="number" name="pourcentage" value="<?php print_r($categories[$_GET['categorie']]['pourcent_Categorie']*100);?>" min=0 max=100 required />

    <input type="number" name="prix" value="<?php print_r($categories[$_GET['categorie']]['prix_Categorie']);?>" min=0 max=999 required />
  
    <input type="submit" name="submit" value="Modifier"/>
</form>
<?php }
else{ ?>
<div class="cartes">
<?php for($i=0; $i<count($categories); $i++){?>
        <a href="index.php?page=modifCat&categorie=<?php echo $i?>">
        <h3><?php print_r($categories[$i]['nom_Categorie']);?></h3>
        <p>Pourcentage de places : <?php print_r($categories[$i]['pourcent_Categorie']);?></p>
        <p>Prix des places : <?php print_r($categories[$i]['prix_Categorie']);?> €</p>
        </a>
<?php } ?>
</div>
<?php }}
require_once(PATH_VIEWS.'footer.php');?>