<?php require_once(PATH_VIEWS.'header.php');?>

<h2>Affinez votre recherche pour l'achat d'une ou plusieurs places</h2>
<form method="post" action="index.php?page=selecDate">

        <fieldset>
            <legend>Selectionnez le type de tournoi :
            </legend>
            <label for="type">Type : </label>
            <select name="type" id="type" required>
                <option value="simplehomme">Tournoi simple - Hommes</option>
                <option value="simplefemme">Tournoi simple - Femmes</option>
                <option value="doublehomme">Tournoi double - Hommes</option>
                <option value="doublefemme">Tournoi double - Femmes</option>
            </select>
        </fieldset>

        <fieldset>
            <legend>Selectionnez la phase du tournoi souhaitée :
            </legend>
            <label for="tour">Tour : </label>
            <select name="tour" id="tour" required>
                <option value="1">Matchs de seizièmes de finale</option>
                <option value="2">Matchs de huitièmes de finale</option>
                <option value="3">Matchs de quarts de finale</option>
                <option value="4">Matchs de demi-finale</option>
                <option value="5">Finale</option>
            </select>
        </fieldset>

        <button type="submit" class="btn" id="valider">Valider</button>

    </form>
<?php require_once(PATH_VIEWS.'footer.php');?>