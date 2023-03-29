<?php require_once(PATH_VIEWS.'header.php');?>

<link rel="stylesheet" href=<?=PATH_STYLE."SaisieScore.css"?>>


<?php if(isset($ajout)){?>

<h2>Ajout effectué</h2>
    
<?php }else{?>

<form action="" method="post">

<fieldset>

<h2> Saisir un score </h2>

<h3> Joueur 1 <h3>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br>

<h3> Joueur 2 <h3>

<input type="text" name="nom" placeholder="Nom" required />

<br>

<input type="text" name="prenom" placeholder="Prénom" required />

<br>

<h3>Score final</h3>

<p>Joueur 1 :</p>
<div>
<input type="number" name="scoreSet1" placeholder="Set 1" min=0 max=6 required />
<input type="number" name="scoreSet2" placeholder="Set 2" min=0 max=6 required />
<input type="number" name="scoreSet3" placeholder="Set 3" min=0 max=6 required />
<input type="number" name="scoreSet4" placeholder="Set 4" min=0 max=6 required />
<input type="number" name="scoreSet5" placeholder="Set 5" min=0 max=6 required />
</div>

<br>

<p>Joueur 2 :</p>
<div>
<input type="number" name="scoreSet1" placeholder="Set 1" min=0 max=6 required />
<input type="number" name="scoreSet2" placeholder="Set 2" min=0 max=6 required />
<input type="number" name="scoreSet3" placeholder="Set 3" min=0 max=6 required />
<input type="number" name="scoreSet4" placeholder="Set 4" min=0 max=6 required />
<input type="number" name="scoreSet5" placeholder="Set 5" min=0 max=6 required />
</div>

<br><br>

<div>
<input type="radio" name="winner" values="Joueur 1" required />
<label for="sexe">Victoire de Joueur 1</label>

<input type="radio" name="winner" values="Joueur 2 " required />
<label for="sexe">Victoire de Joueur 2</label><br>
</div>

<br><br>

<input type="submit" name="submit" value="Ajouter"/>
</fieldset>
</form>
<?php }?>