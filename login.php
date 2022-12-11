<?php 
if($_SERVER['REQUEST_METHOD']=='POST'){
    $user = $_POST['username'];
    $pass = $_POST['password'];
    require_once('dbconnect.php');
    $sql = "SELECT * FROM volley WHERE username ='$user' AND password='$pass'";
    $result = mysqli_query($con,$sql);
    $check = mysqli_fetch_array($result);
    if(isset($check)){
        echo 'success'; 
    }else{
        echo 'failure';
    }
}

?>