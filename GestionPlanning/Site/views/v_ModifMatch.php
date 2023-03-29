<?php require_once(PATH_VIEWS.'header.php');?>


<link rel="stylesheet" href=<?=PATH_STYLE."ModifierMatch.css"?>>


<?php if(isset($ajout)){?>

<h2>Ajout effectué</h2>
    
<?php }else{?>

<form action="" method="post">

<fieldset>
<h2>Modifier un match</h2>

<h3>Entrer le numéro du match à modifier</h3>

<select type="text" name="match" id="select">
    <option value="M01">Match 01</option>
    <option value="M02">Match 02</option>
</select>


<h3>Changer l'arbitre principal</h3>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br>
<input type="text" name="pays" placeholder="Pays d'origine" required />

<br>
<div>

<input type="radio" name="sexe" values="Homme" required />
<label for="sexe">Homme</label>

<input type="radio" name="sexe" values="Femme" required />
<label for="sexe">Femme</label><br>
</div>
<br><br>

<h3>Changer l'arbitre secondaire n°1</h3>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br>
<input type="text" name="pays" placeholder="Pays d'origine" required />

<br>
<div>

<input type="radio" name="sexe" values="Homme" required />
<label for="sexe">Homme</label>

<input type="radio" name="sexe" values="Femme" required />
<label for="sexe">Femme</label><br>
</div>
<br><br>

<h3>Changer l'arbitre secondaire n°2</h3>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br>
<input type="text" name="pays" placeholder="Pays d'origine" required />

<br>
<div>

<input type="radio" name="sexe" values="Homme" required />
<label for="sexe">Homme</label>

<input type="radio" name="sexe" values="Femme" required />
<label for="sexe">Femme</label><br>
</div>
<br><br>

<h3>Changer l'horaire</h3>

<div>

<input type="radio" name="heure" values="Matin" required />
<label for="heure">Matin</label>

<input type="radio" name="heure" values="Midi" required />
<label for="heure">Midi</label>

<input type="radio" name="heure" values="Soir" required />
<label for="heure">Soir</label>

<br>
</div>
<br><br>

<input type="submit" name="submit" value="Faire la modification"/>


</fieldset>
</form>

<?php }?>