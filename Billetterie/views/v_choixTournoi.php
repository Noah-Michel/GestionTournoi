<?php require_once(PATH_VIEWS.'header.php');?>

<form action="" method="post">
  
    <select name="tournoi">
    <?php for($i=0; $i<count($tournois); $i++){
        print_r('<option value='.$tournois[$i]['num_Tournoi'].'>'.$tournois[$i]['nom_Tournoi'].'</option>');
    }?>
    <input type="submit" name="submit" value="Sélectionner"/>
</form>

<?php if(isset($_POST['tournoi'])){?>
    <p>Nouveau tournoi bien sélectionné</p>
<?php }?>

<?php require_once(PATH_VIEWS.'footer.php');