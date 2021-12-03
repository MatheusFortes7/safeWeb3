window.onload = () => {
    
    var c = localStorage.getItem('comentario');
    var array = [];
    
    let meusComentarios = document.getElementById('meus-comentarios');
   
    if (c==null || c=='[]'){

        meusComentarios.innerHTML = ` <h3 style="color: rgb(0, 153, 255);">Meus comentarios</h3><p>Você ainda não fez nenhum comentário!</p>`
    }

    console.log(c);
    
    c = JSON.parse(c);

    for (i=0; i<c.length; i++) {
       
        meusComentarios.innerHTML += 
       ` <div class="darker mt-4 text-justify"> <img src="https://www.promoview.com.br/uploads/2017/04/b72a1cfe.png" alt=""
        class="rounded-circle" width="40" height="40">
      <h4>${JSON.parse(sessionStorage.getItem('usuarioCorrente')).nome} </h4> 
      <p>${c[i]}</p>
        </div>`
    }



}