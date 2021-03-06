<?php
  
?>

<!DOCTYPE html>
<html lang="pt-br">
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
</head>
<body>
  
<script src="https://unpkg.com/blip-chat-widget" type="text/javascript"> 
  </script>
<script>
    (function () {
        window.onload = function () {
            new BlipChat()
            .withAppKey('dGVzdGVrb2Fvb3NrOmFkODhlOWQ2LTE3MjgtNDg2NC1iMWQyLTllNDhmNjFlMGZkMw==')
            .withButton({"color":"#0324f7","icon":""})
            .withCustomCommonUrl('https://matheus-fortes-fnxpt.chat.blip.ai/')
            .build();
        }
    })();
</script>
  
<header>
 <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  <nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.php">SafeWeb</a>
        <!-- <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button> -->

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item m-auto active">
                    <a class="nav-link" href="index.php">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Recomendacoes.html">Recomenda????es</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ReclameAqui.html">Reclame aqui</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="perfil.html">Meu Perfil  </a>
                </li>
            </ul>
        </div>
    </div>
  </nav>
</header>

<main>
    <br><br>
  <div class="container">
      <div class="row">
    <div class="col-sm-12 col-md-12 col-lg-6">
    <h1 style="color: rgb(0, 153, 255);">SafeWeb: Mais seguran??a para voc?? e sua fam??lia</h1>
      <p>Com a SafeWeb voc?? pode checar facilmente o hist??rico de um vendedor ou de uma empresa, tornando suas compras online bem mais seguras</p>

      <a href="php/cadastrar/cadastro.php"><button type="button" class="btn btn-primary">Cadastro</button></a><br><br>
      <a href="php/login/login.php"><button type="button" class="btn btn-primary">Login</button></a>
    </div>
    <div class="col-sm-8 col-md-8 col-lg-6">
      <img src="seguran??a-internet.png" class="col-md-12 float-md-end mb-3 mt-3 ms-md-3" alt="...">
    </div>
  </div>
</div>
  <br><br>
  <div class="container bg-gray">
      <div class="row">
        <div class="col-sm-8 col-md-8 col-lg-6">
            <img src="comprasNaInternet.jpg" class="col-md-12 float-md-end mb-3 ms-md-3" alt="...">
        </div> 
    <div class="col-sm-12 col-md-12 col-lg-6">
      <h2 style="color: rgb(0, 153, 255);">Com a SafeWeb voc?? est?? protegido de golpes.</h2>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis facilis harum sit possimus eos iure ducimus ut nesciunt? Incidunt laborum at maiores autem ipsa hic labore accusantium voluptate magnam eligendi unde maxime optio reiciendis quisquam provident sit placeat, architecto aspernatur.</p>
    </div>
    </div>
  </div>

  <br><br>
  <div class="container">
      <div class="row">
    <div class="col-sm-12 col-md-12 col-lg-6">
      <h2 style="color: rgb(0, 153, 255);"> Conhe??a o vendedor</h2>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis tenetur incidunt in excepturi, repellendus, eaque cumque a neque ad temporibus laudantium veniam eveniet. Sed, quis dignissimos ullam iure voluptas earum molestias. Omnis tempora distinctio quasi dicta illo autem quas. Cupiditate pariatur amet omnis laborum delectus architecto eveniet, deserunt obcaecati molestiae?</p>
    </div> 
    <div class="col-sm-8 col-md-8 col-lg-6">
     <img src="E-commerce.jpg" class="col-md-12 float-md-end mb-3 ms-md-3" alt="...">
    </div>
    </div>
  </div>
  <br><br>
</main>
  

    
<footer class="text-light navbar-dark bg-dark">
  <div class="container">
      <div class="row">
          <div class="col-md-3 col-lg-4 col-xl-3">
              <h5>SafeWeb</h5>
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
              <p class="mb-0">
                  Projeto de um site para verifica????o de compras online
              </p>
          </div>

          <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25 " style="color: white;">
              <ul class="list-unstyled">
                  <li><a href="home.html">Home</a></li>
                  <li><a href="Recomendacoes.html">Recomenda????es</a></li>
                  <li><a href="ReclameAqui.html">Reclame aqui</a></li>
                  <li><a href="cadastro.html">Cadastro</a></li>
              </ul>
          </div>

          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
              <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
              <ul class="list-unstyled">
                  <li><a href="ReclameAqui.html">Pesquisa </a></li>
                  <li><a href="https://wa.me/5531981166116/?text=Ol%C3%A1%2C+estou+precisando+de+suporte%21" target="_blank">Suporte </a></li>
                  <li><a href="perfil.html">Meu Perfil </a></li>
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
                  <a href="index.php">Volte para o topo</a>
              </p>
      </div>
  </div>
</footer>

</body>
</html>

