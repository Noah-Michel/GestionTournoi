<?php require_once(PATH_VIEWS.'header.php');?>

<div class="recap">
    <h2>Recapitulatif de la commande en cours</h2>
    <form method="post" action="index.php?page=redirection">
    <p>Tour: <?php  print_r($_SESSION['matchs'][$_GET['match']]['num_Phase_Match'])?></p>
    <p>Rencontre : <?php print_r($_SESSION['matchs'][$_GET['match']]['prenom_Jou1'].' '.$_SESSION['matchs'][$_GET['match']]['nom_Jou1']);?> VS <?php print_r($_SESSION['matchs'][$_GET['match']]['prenom_Jou2'].' '.$_SESSION['matchs'][$_GET['match']]['nom_Jou2']);?></p>
    <p>Date : <?php print_r($_SESSION['matchs'][$_GET['match']]['date_Match']);?></p>
    <p>Heure : <?php print_r($_SESSION['matchs'][$_GET['match']]['horaire_Match']);?></p>
    <p>Type de la place : <?php print_r($_SESSION['categorie']['nom_Categorie']);?></p>
    <p id="prix">Prix de la place de la catégorie : <?php print_r($_SESSION['categorie']['prix_Categorie']);?>
    <p><label for="nbBillet">Nombre de billets :</label>
    <input type="number" id="nbBillet" name="nbBillet"
       value="1" min="1" max="10">
    </p>
    <p>
    <label for="codePromo">Code promotionnel :</label>
    <input type="textfield">
    <p><button type="submit" class="btn" id="code">Appliquer le code promotionnel</button>
    </p>
    <p id="prixAffiche">Prix commande : <?php print_r($_SESSION['categorie']['prix_Categorie']);?></p>
    <input type="submit" classe="btn" value="Finaliser la commande"></input>
    </form>
    <script src="<?php echo PATH_SCRIPT.$page?>.js"></script>
</div>

<?php require_once(PATH_VIEWS.'footer.php'); ?>