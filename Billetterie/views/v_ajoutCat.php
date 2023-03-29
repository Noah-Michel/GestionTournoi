<?php require_once(PATH_VIEWS.'header.php');?>

<?php if(isset($ajout)){?>

    <h2>Ajout effectué</h2>
        
<?php }else{?>

<form action="" method="post">
    <h2>Ajouter une catégorie</h2>
  
    <input type="text" name="nom" placeholder="Nom" required />

    <input type="number" name="pourcentage" placeholder="%" min=0 max=100 required />

    <input type="number" name="prix" placeholder="€" min=0 max=999 required />
  
    <input type="submit" name="submit" value="Ajouter"/>
</form>
<?php }?>
<?php require_once(PATH_VIEWS.'footer.php');?>