<?php require_once(PATH_VIEWS.'header.php');?>
<div class= "tableau">
    <div class="seiziemes">
        <h2>16èmes de final</h2>
        <?php
        for($i=0; $i<count($joueurs1); $i++){?>
            <div class="match">
                <div class="joueur">
                    <div class="j1">
                        <h3><?php print_r($joueurs1[$i]['prenom_Jou'].' '.$joueurs1[$i]['nom_Jou'].' ('.$joueurs1[$i]['rangM_Jou'].')');?></h3>
                    </div>
                    <div class="j2">
                        <h3><?php print_r($joueurs2[$i]['prenom_Jou'].' '.$joueurs2[$i]['nom_Jou'].' ('.$joueurs2[$i]['rangM_Jou'].')');?></h3>
                    </div>
                </div>
            </div>
        <?php }?>
    </div>

    <div class = "formulaire">
            <form action="">
                <fieldset>
                    <h2>Générer un nouveau tournoi</h2>
                    <input type="text" name="nomTournoi" placeholder="Nom du nouveau tournoi" required />
                    <br><br>
                    <button class="button g"><span>Valider le premier tour</span></button>
                </fieldset>
            </form>
    </div>

    <a href="index.php?page=newTournoi"><button class="button o"><span>Refaire le tirage</span></button></a>

</div>

<?php require_once(PATH_VIEWS.'footer.php');?>