<div class = "seiziemes">
    <h2>16èmes de final</h2>

    <?php
    if(isset($seiziemes)){
        for($i=0; $i<count($seiziemes); $i++){?>
            <div class="match">
                <div class="joueur">
                    <?php
                    if($gagnant16[$i]['gagnant_Match'] == $seiziemes[$i]['num_Jou1']){ ?>
                        <div class="j1 gagnant">
                            <h3><?php print_r($seiziemes[$i]['prenom_Jou1'].' '.$seiziemes[$i]['nom_Jou1'].' ('.$seiziemes[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2">
                            <h3><?php print_r($seiziemes[$i]['prenom_Jou2'].' '.$seiziemes[$i]['nom_Jou2'].' ('.$seiziemes[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }else{?>
                        <div class="j1">
                            <h3><?php print_r($seiziemes[$i]['prenom_Jou1'].' '.$seiziemes[$i]['nom_Jou1'].' ('.$seiziemes[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2 gagnant">
                            <h3><?php print_r($seiziemes[$i]['prenom_Jou2'].' '.$seiziemes[$i]['nom_Jou2'].' ('.$seiziemes[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }?>
                </div>
            </div>

    <?php }}else{
        for($i; $i<16; $i++){?>
            <div class="match">
                <div class="joueur">
                    <div class="j1">
                        <h3>Joueur 1</h3>
                    </div>
                    <div class="j2">
                        <h3>Joueur 2</h3>
                    </div>
                </div>
            </div>
    <?php }}?>

</div>

<div class = "huitiemes">
    <h2>8èmes de final</h2>

    <?php
    if(isset($huitiemes)){
        for($i=0; $i<count($huitiemes); $i++){?>
            <div class="match">
                <div class="joueur">
                    <?php
                    if($gagnant8[$i]['gagnant_Match'] == $huitiemes[$i]['num_Jou1']){ ?>
                        <div class="j1 gagnant">
                            <h3><?php print_r($huitiemes[$i]['prenom_Jou1'].' '.$huitiemes[$i]['nom_Jou1'].' ('.$huitiemes[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2">
                            <h3><?php print_r($huitiemes[$i]['prenom_Jou2'].' '.$huitiemes[$i]['nom_Jou2'].' ('.$huitiemes[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }else{?>
                        <div class="j1">
                            <h3><?php print_r($huitiemes[$i]['prenom_Jou1'].' '.$huitiemes[$i]['nom_Jou1'].' ('.$huitiemes[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2 gagnant">
                            <h3><?php print_r($huitiemes[$i]['prenom_Jou2'].' '.$huitiemes[$i]['nom_Jou2'].' ('.$huitiemes[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }?>
                </div>
            </div>

    <?php }}else{
        for($i; $i<8; $i++){?>
            <div class="match">
                <div class="joueur">
                    <div class="j1">
                        <h3>Joueur 1</h3>
                    </div>
                    <div class="j2">
                        <h3>Joueur 2</h3>
                    </div>
                </div>
            </div>
    <?php }}?>

</div>

<div class = "quarts">
    <h2>Quarts de final</h2>

    <?php
    if(isset($quarts)){
        for($i=0; $i<count($quarts); $i++){?>
            <div class="match">
                <div class="joueur">
                <?php
                    if($gagnant4[$i]['gagnant_Match'] == $quarts[$i]['num_Jou1']){ ?>
                        <div class="j1 gagnant">
                            <h3><?php print_r($quarts[$i]['prenom_Jou1'].' '.$quarts[$i]['nom_Jou1'].' ('.$quarts[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2">
                            <h3><?php print_r($quarts[$i]['prenom_Jou2'].' '.$quarts[$i]['nom_Jou2'].' ('.$quarts[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }else{?>
                        <div class="j1">
                            <h3><?php print_r($quarts[$i]['prenom_Jou1'].' '.$quarts[$i]['nom_Jou1'].' ('.$quarts[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2 gagnant">
                            <h3><?php print_r($quarts[$i]['prenom_Jou2'].' '.$quarts[$i]['nom_Jou2'].' ('.$quarts[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }?>
                </div>
            </div>

    <?php }}else{
        for($i; $i<4; $i++){?>
            <div class="match">
                <div class="joueur">
                    <div class="j1">
                        <h3>Joueur 1</h3>
                    </div>
                    <div class="j2">
                        <h3>Joueur 2</h3>
                    </div>
                </div>
            </div>
    <?php }}?>

</div>

<div class = "demis">
    <h2>Demis final</h2>

    <?php
    if(isset($demis)){
        for($i=0; $i<count($demis); $i++){?>
            <div class="match">
                <div class="joueur">
                <?php
                    if($gagnant2[$i]['gagnant_Match'] == $demis[$i]['num_Jou1']){ ?>
                        <div class="j1 gagnant">
                            <h3><?php print_r($demis[$i]['prenom_Jou1'].' '.$demis[$i]['nom_Jou1'].' ('.$demis[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2">
                            <h3><?php print_r($demis[$i]['prenom_Jou2'].' '.$demis[$i]['nom_Jou2'].' ('.$demis[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }else{?>
                        <div class="j1">
                            <h3><?php print_r($demis[$i]['prenom_Jou1'].' '.$demis[$i]['nom_Jou1'].' ('.$demis[$i]['rangM_Jou1'].')');?></h3>
                        </div>
                        <div class="j2 gagnant">
                            <h3><?php print_r($demis[$i]['prenom_Jou2'].' '.$demis[$i]['nom_Jou2'].' ('.$demis[$i]['rangM_Jou2'].')');?></h3>
                        </div>
                    <?php }?>
                </div>
            </div>

    <?php }}else{
        for($i; $i<2; $i++){?>
            <div class="match">
                <div class="joueur">
                    <div class="j1">
                        <h3>Joueur 1</h3>
                    </div>
                    <div class="j2">
                        <h3>Joueur 2</h3>
                    </div>
                </div>
            </div>
    <?php }}?>

</div>

<div class = "finals">
    <h2>Final/Petite final</h2>

    <?php
    if(isset($finals)){?>
        <div class="match final">
            <div class="joueur">

                <?php
                if($gagnant1[0]['gagnant_Match'] == $finals[0]['num_Jou1']){ ?>
                    <div class="j1 gagnant">
                        <h3><?php print_r($finals[0]['prenom_Jou1'].' '.$finals[0]['nom_Jou1'].' ('.$finals[0]['rangM_Jou1'].')');?></h3>
                    </div>
                    <div class="j2">
                        <h3><?php print_r($finals[0]['prenom_Jou2'].' '.$finals[0]['nom_Jou2'].' ('.$finals[0]['rangM_Jou2'].')');?></h3>
                    </div>
                <?php }else{?>
                    <div class="j1">
                        <h3><?php print_r($finals[0]['prenom_Jou1'].' '.$finals[0]['nom_Jou1'].' ('.$finals[0]['rangM_Jou1'].')');?></h3>
                    </div>
                    <div class="j2 gagnant">
                        <h3><?php print_r($finals[0]['prenom_Jou2'].' '.$finals[0]['nom_Jou2'].' ('.$finals[0]['rangM_Jou2'].')');?></h3>
                    </div>
                <?php }?>

            </div>
        </div>

        <div class="match petitefinal">
            <div class="joueur">

                <?php
                if($gagnant1[1]['gagnant_Match'] == $finals[1]['num_Jou1']){ ?>
                    <div class="j1 gagnant">
                        <h3><?php print_r($finals[1]['prenom_Jou1'].' '.$finals[1]['nom_Jou1'].' ('.$finals[1]['rangM_Jou1'].')');?></h3>
                    </div>
                    <div class="j2">
                        <h3><?php print_r($finals[1]['prenom_Jou2'].' '.$finals[1]['nom_Jou2'].' ('.$finals[1]['rangM_Jou2'].')');?></h3>
                    </div>
                <?php }else{?>
                    <div class="j1">
                        <h3><?php print_r($finals[1]['prenom_Jou1'].' '.$finals[1]['nom_Jou1'].' ('.$finals[1]['rangM_Jou1'].')');?></h3>
                    </div>
                    <div class="j2 gagnant">
                        <h3><?php print_r($finals[1]['prenom_Jou2'].' '.$finals[1]['nom_Jou2'].' ('.$finals[1]['rangM_Jou2'].')');?></h3>
                    </div>
                <?php }?>

            </div>
        </div>
        
    <?php }else{?>
        <div class="match final">
            <div class="joueur">
                <div class="j1">
                     <h3>Joueur 1</h3>
                </div>
                <div class="j2">
                    <h3>Joueur 2</h3>
                </div>
            </div>
        </div>

        <div class="match petitefinal">
            <div class="joueur">
                <div class="j1">
                     <h3>Joueur 1</h3>
                </div>
                <div class="j2">
                    <h3>Joueur 2</h3>
                </div>
            </div>
        </div>
        <?php }?>
        
</div>

<div class = "podium">
    <h2>Podium</h2>

    <div class ="premier">
        <?php if($gagnant1[0]['gagnant_Match'] == $finals[0]['num_Jou1']){ ?>
            <h3><?php print_r($finals[0]['prenom_Jou1'].' '.$finals[0]['nom_Jou1'].' ('.$finals[0]['rangM_Jou1'].')');?></h3>
        <?php }else{ ?>
            <h3><?php print_r($finals[0]['prenom_Jou2'].' '.$finals[0]['nom_Jou2'].' ('.$finals[0]['rangM_Jou2'].')');?></h3>
        <?php } ?>
    </div>

    <div class ="deuxieme">
        <?php if($gagnant1[0]['gagnant_Match'] != $finals[0]['num_Jou1']){ ?>
            <h3><?php print_r($finals[0]['prenom_Jou1'].' '.$finals[0]['nom_Jou1'].' ('.$finals[0]['rangM_Jou1'].')');?></h3>
        <?php }else{ ?>
            <h3><?php print_r($finals[0]['prenom_Jou2'].' '.$finals[0]['nom_Jou2'].' ('.$finals[0]['rangM_Jou2'].')');?></h3>
        <?php } ?>
    </div>

    <div class ="troisieme">
        <?php if($gagnant1[1]['gagnant_Match'] == $finals[0]['num_Jou1']){ ?>
            <h3><?php print_r($finals[1]['prenom_Jou1'].' '.$finals[1]['nom_Jou1'].' ('.$finals[1]['rangM_Jou1'].')');?></h3>
        <?php }else{ ?>
            <h3><?php print_r($finals[1]['prenom_Jou2'].' '.$finals[1]['nom_Jou2'].' ('.$finals[1]['rangM_Jou2'].')');?></h3>
        <?php } ?>
    </div>
</div>
