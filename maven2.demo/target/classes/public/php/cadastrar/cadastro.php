<?php
    session_start();
?>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SafeWeb</title>
    <meta name="description" content="Site para conferir se uma compra e confiavel">
    <meta name="keywords" content="compras">
    <meta name="author" content="Matheus Fortes">
    <link type="stylesheet" href="style.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	 crossorigin="anonymous">
</head>

<body>
<header>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  <nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="../../index.php">SafeWeb</a>
        <!-- <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button> -->

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item m-auto active">
                    <a class="nav-link" href="../../index.php">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../../Recomendacoes.html">Reclamações</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../../ReclameAqui.html">Reclame aqui</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../../perfil.html">Meu Perfil  </a>
                </li>
            </ul>
        </div>
    </div>
  </nav>
</header>

    <h1 class="card-title text-center mb-4 mt-1">Cadastro</h1><br><br>
    <div>
        <?php
            if (isset($_SESSION["mensagem"])){
                echo $_SESSION["mensagem"];
                unset($_SESSION["mensagem"]);
            }
    
        ?>
    </div>
    <div id="login-row" class="row justify-content-center align-items-center">
        <div id="login-column" class="col-md-8>
            <div id="login -box" class="col-md-12">
                <form action="../functions/func_cadastro.php" method="POST">
                    <label for="">E-mail:</label><br><br><div class="input-group-prepend">
                    <input type="email" name="email"></div><br><br>
                    <label for="">Senha : </label><br><br><div class="input-group-prepend">
                    <input type="password" name="senha"></div><br><br>
                    <button>Cadastrar</button>
                </form>
        </div>
    </div><br><br><br><br><br><br><br><br><br><br><br>
    <footer class="text-light navbar-dark bg-dark">
  <div class="container">
      <div class="row">
          <div class="col-md-3 col-lg-4 col-xl-3">
              <h5>SafeWeb</h5>
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
              <p class="mb-0">
                  Projeto de um site para verificação de compras online
              </p>
          </div>

          <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25 " style="color: white;">
              <ul class="list-unstyled">
                  <li><a href="../../index.php">Home</a></li>
                  <li><a href="../../Recomendacoes.html">Recomendações</a></li>
                  <li><a href="../../ReclameAqui.html">Reclame aqui</a></li>
                  <li><a href="cadastro.php">Cadastro</a></li>
              </ul>
          </div>

          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
              <ul class="list-unstyled">
                  <li><a href="../../ReclameAqui.html">Pesquisa </a></li>
                  <li><a href="">Contato </a></li>
                  <li><a href="../../perfil.html">Meu Perfil </a></li>
              </ul>
          </div>

          <div class="col-md-4 col-lg-3 col-xl-3">
              <h5>Acompanhe as novidades</h5>
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
              <div class="input-group input-group-sm">
                <input type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Insira seu email">
                <div class="input-group-append">
                    <button type="button" class="btn btn-secondary btn-number">
                      <i class="fa fa-check"></i>
                    </button>
                </div>
            </div>
          </div>
          <div class="col-12 copyright mt-3">
              <p class="float-left">
                  <a href="cadastro.php">Volte para o topo</a>
              </p>
      </div>
  </div>
</footer>
</body>
</html>
