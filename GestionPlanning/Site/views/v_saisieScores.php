<?php require_once(PATH_VIEWS.'header.php');?>

<h2>Saisie des scores</h2>
<form method="post" action="index.php?page=">
    <fieldset>
        <legend>Sélectionnez le match :</legend>
        <label for="">Match :</label>
        <select name="tour" id="tour" required>
            <option value="16e1">j1 vs j2</option>
            <option value="16e2">j1 vs j2</option>
            <option value="16e3">j1 vs j2</option>
            <option value="16e4">j1 vs j2</option>
            <option value="16e5">j1 vs j2</option>
            <option value="16e6">j1 vs j2</option>
            <option value="16e7">j1 vs j2</option>
            <option value="16e8">j1 vs j2</option>
            <option value="16e9">j1 vs j2</option>
            <option value="16e10">j1 vs j2</option>
            <option value="16e11">j1 vs j2</option>
            <option value="16e12">j1 vs j2</option>
            <option value="16e13">j1 vs j2</option>
            <option value="16e14">j1 vs j2</option>
            <option value="16e15">j1 vs j2</option>
            <option value="16e16">j1 vs j2</option>
            <option value="8e1">j1 vs j2</option>
            <option value="8e2">j1 vs j2</option>
            <option value="8e3">j1 vs j2</option>
            <option value="8e4">j1 vs j2</option>
            <option value="8e5">j1 vs j2</option>
            <option value="8e6">j1 vs j2</option>
            <option value="8e7">j1 vs j2</option>
            <option value="8e8">j1 vs j2</option>
            <option value="quart1">j1 vs j2</option>
            <option value="quart2">j1 vs j2</option>
            <option value="quart3">j1 vs j2</option>
            <option value="quart4">j1 vs j2</option>
            <option value="demi1">j1 vs j2</option>
            <option value="demi2">j1 vs j2</option>
            <option value="final">j1 vs j2</option>
        </select>
    </fieldset>

    <button type="submit" class="button g" id="valider">Valider</button>
    <button class="button o" id="annuler">Annuler</button>

</form>