<?php
    session_start();

    /*if (isset($_GET)) {
        header("location: cadastro.html");
        die;
    }*/

    //if (isset($_POST["email"])) {


        include("conexao.php");

        $email=$_POST['email'];
        $senha=$_POST['senha'];


        $sql="INSERT INTO usuarios(email, senha) VALUES('$email', '$senha')";


        if(mysqli_query($conn, $sql)){
            $_SESSION["mensagem"] = "Usuario cadastrado com sucesso";

            header("location: ../cadastrar/cadastro.php");
            die;
        }
        else{
            echo "Error" .mysqli_connect_error($conn);
            die;
        }
        mysqli_close($conn);
    //}
?>