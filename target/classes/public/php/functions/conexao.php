<?php
    //require "../../vendor/autoload.php";

    //$dotenv = Dotenv\Dotenv::createImmutable('../../');
    //$dotenv->load();
    
    $servidor=$_ENV['MYSQL_HOST'];
    $usuario=$_ENV['MYSQL_USER'];
    $senha=$_ENV['MYSQL_PASSWORD'];
    $dbname=$_ENV['MYSQL_DB'];

    $conn=mysqli_connect($servidor, $usuario, $senha, $dbname);
    if(!$conn){
        die("Houve um erro:" .mysqli_connect_error());
    }
?>