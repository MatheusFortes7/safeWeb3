<?php
include('conexao.php');

if(isset($_POST['email']) || isset($_POST['senha'])) {

    if(strlen($_POST['email']) == 0) {
        echo "Preencha seu e-mail";
    } else if(strlen($_POST['senha']) == 0) {
        echo "Preencha sua senha";
    } else {

        $email = mysqli_real_escape_string($conn, $_POST['email']);
        $senha = mysqli_real_escape_string($conn, $_POST['senha']);

        $sql = "SELECT * FROM usuarios WHERE email = '$email' AND senha = '$senha'";
        $query = mysqli_query($conn, $sql);

        if (mysqli_num_rows($query) === 1) {
            echo "Login realizado com sucesso";
            die;
        } else {
            echo "Conta não cadastrada";
            die;
        }

    }

}
?>
