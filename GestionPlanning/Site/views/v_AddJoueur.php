<?php require_once(PATH_VIEWS.'header.php');?>

<link rel="stylesheet" href=<?=PATH_STYLE."addJoueur.css"?>>

<?php if(isset($ajout)){?>

<h2>Ajout effectué</h2>
    
<?php }else{?>

<form action="" method="post">
<fieldset>

<h2>Ajouter un nouveau joueur</h2>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br><br>
<div>

<input type="radio" name="sexe" values="Homme" required />
<label for="sexe">Homme</label>

<input type="radio" name="sexe" values="Femme" required />
<label for="sexe">Femme</label><br>
</div>
<br>

<input type="text" name="pays" placeholder="Pays d'origine" required />

<br><br>


<input type="submit" name="submit" value="Ajouter"/>

</fieldset>

</form>


<?php }?>