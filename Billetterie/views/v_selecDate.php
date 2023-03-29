<?php require_once(PATH_VIEWS.'header.php');?>

<h2>Selectionnez le match auquel vous souhaitez assister</h2>

<form method="post" action="index.php?page=selecMatch">
    <fieldset>
        <legend>Date : </legend>
        <?php if(isset($dates)){
            for($i=0; $i<count($dates); $i++){?>
                <input type="submit" class="btn" id="valider" name="date" value="<?php print_r($dates[$i]['date_Match']);?>">
            <?php }
        }?>
    </fieldset>
</form>
<?php require_once(PATH_VIEWS.'footer.php');?>