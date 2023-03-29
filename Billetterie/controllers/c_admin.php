<?php
if(isset($_SESSION['logged'])){
    if($_SESSION['logged'] == true){
        require_once(PATH_VIEWS.$page.".php");
    }
    else{
        $page='login';
        if (isset($_POST['login']) && isset($_POST['pwd'])){
            if($_POST['login']==identifiant ){
                if( password_verify($_POST['pwd'],HMDP)){
                    $_SESSION['logged']=true;
                    $page='admin'; 
                }else{
                    require_once(PATH_VIEWS.$page.".php");
                }
            }else{
                require_once(PATH_VIEWS.$page.".php");
            }
        }
        require_once(PATH_VIEWS.$page.".php"); 
    }
}
else{   
    $page='login';
    if (isset($_POST['login']) && isset($_POST['pwd'])){
        if($_POST['login']==identifiant ){
            if( password_verify($_POST['pwd'],HMDP)){
                $_SESSION['logged']=true;
                $page='admin'; 
            }else{
                require_once(PATH_VIEWS.$page.".php");
            }
        }else{
            require_once(PATH_VIEWS.$page.".php");
        }
    }
    require_once(PATH_VIEWS.$page.".php"); 
}