<?php require_once(PATH_VIEWS.'header.php');?>

<h2>Selectionnez le match auquel vous souhaitez assiser</h2>

<div class="cartes">
<?php
    for($i=0; $i<count($matchs); $i++){?>
        <a href="index.php?page=selecPlace&match=<?php echo $i?>">
        <h3><?php print_r($matchs[$i]['prenom_Jou1'].' '.$matchs[$i]['nom_Jou1']);?> VS <?php print_r($matchs[$i]['prenom_Jou2'].' '.$matchs[$i]['nom_Jou2']);?></h3>
        <p>Date: <?php print_r($matchs[$i]['date_Match']);?></p>
        <p>Horaire: <?php print_r($matchs[$i]['horaire_Match']);?></p>
        <p>Stade: <?php print_r($matchs[$i]['nom_Stade']);?></p>
        </a>
    <?php }?>
</div>

<?php require_once(PATH_VIEWS.'footer.php');?>