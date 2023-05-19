function mostrarTextoCompleto(elemento) {
    elemento.parentNode.querySelector('.texto-corto').style.display = 'none';
    elemento.parentNode.querySelector('.texto-completo').style.display = 'block';
    elemento.style.display = 'none';
  }

 