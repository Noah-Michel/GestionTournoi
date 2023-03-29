<?php
require_once('./config/config.php');

define('tournoi','T01');
session_start();

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