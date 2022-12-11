<?php 
try{
$pdo = new PDO("mysql:host=localhost;dbname=appmusic","root","");
}catch(Exception $e){
    die('Erreur de connexion :'.$e->getMessage()); 
}
?>