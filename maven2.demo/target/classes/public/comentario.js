window.onload = () => {

    var c = localStorage.getItem('comentario');
    var array = [];
    
    if (c==null){
        localStorage.setItem('comentario', JSON.stringify(array));
        sessionStorage.setItem('comentario', JSON.stringify(array));
    }
    
    c = JSON.parse(c);

    fcomentario.onsubmit = () => {
      
        c.push(comentariotexto.value);
        localStorage.setItem('comentario', JSON.stringify(c));   
        sessionStorage.setItem('comentario', JSON.stringify(c)); 
    }
  
    let divcomentarios = document.getElementById('divcomentarios');
   
    for (i=0; i<c.length; i++) {
       
        divcomentarios.innerHTML += 
       ` <div class="darker mt-4 text-justify" style="margin-top:5px;"> <img src="https://www.promoview.com.br/uploads/2017/04/b72a1cfe.png" alt=""
        class="rounded-circle" width="40" height="40">
      <h4>${JSON.parse(sessionStorage.getItem('usuarioCorrente')).nome} </h4> 
      <p>${c[i]}</p>
        </div>`
    }
    
   
}
 

