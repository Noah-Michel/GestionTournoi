<?php require_once(PATH_VIEWS.'header.php'); ?>
<form action="?page=admin" method="post">
    <fieldset>
        <legend>Identifiant :</legend>
        <input type="text" name="login">
    </fieldset>
 
    <fieldset>
    <legend>Mot de passe :</legend>
    <input type="password" name="pwd">
    </fieldset>
    
    <input type="submit" class="btn" value="Se connecter">
</form>
<?php require_once(PATH_VIEWS.'footer.php'); ?>