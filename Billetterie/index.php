<?php
require_once('./config/config.php');

session_start();

if(!isset($_SESSION['tournoi']) || empty($_SESSION['tournoi'])){
  $_SESSION['tournoi'] = 'T01';
}

if(isset($_GET['page']))
{
  $page = htmlspecialchars($_GET['page']); // http://.../index.php?page=toto
  if(!is_file(PATH_CONTROLLERS.$_GET['page'].".php"))
  { 
    $page = '404'; //page demandée inexistante
  }
}
else
	$page='accueil';

require_once(PATH_CONTROLLERS.$page.'.php'); 
?>