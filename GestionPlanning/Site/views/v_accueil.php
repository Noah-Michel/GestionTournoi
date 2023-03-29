<?php require_once(PATH_VIEWS.'header.php');?>
    <div>
        <form method="post" action="index.php?page=accueil">
            <fieldset>
                <h2>Tournoi :</h2>
                <select name="tournoi" id="tournoi">
                    <option value="T01">T01</option>
                    <option value="T02">T02</option>
                </select>

                <button type="submit" class="button g" id="valider">Sélectionner</button>
            </fieldset>
        </form>
    </div>
    <div class="tableau">
        <?php require(PATH_CONTROLLERS.'tournoi.php');?>
    </div>

<?php require_once(PATH_VIEWS.'footer.php');?>