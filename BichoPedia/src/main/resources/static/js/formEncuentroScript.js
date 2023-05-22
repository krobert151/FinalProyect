let formulario = document.forms.formEncuentro;
let fechaInput = formulario.elements.fecha;

fechaInput.addEventListener('change', validarFecha);
formulario.addEventListener('submit', validarEspecie);
formulario.addEventListener('submit', validarNumeros);
formulario.addEventListener('submit', validarFoto);

function validarFecha() {
    let fechaSeleccionada = new Date(fechaInput.value);
    let fechaActual = new Date();
    if (fechaSeleccionada < fechaActual) {
        fechaInput.classList.remove('is-invalid');
        fechaInput.classList.add('is-valid');
        fechaInput.nextElementSibling();
    } else {
        fechaInput.classList.remove('is-valid');
        fechaInput.classList.add('is-invalid');
        fechaInput.value = '';
        fechaInput.nextElementSibling.style.display = 'block';
    }

    invalid - feedback.style.display == 'none';
}


function validarNumeros(event) {
    let tamanioInput = document.querySelector('input[name="tamanio"]');
    let pesoInput = document.querySelector('input[name="peso"]');
    if (tamanioInput.value < 0 || pesoInput.value < 0) {
        event.preventDefault();
        if (tamanioInput.value < 0) {
            tamanioInput.classList.remove('is-valid');
            tamanioInput.classList.add('is-invalid');
            tamanioInput.nextElementSibling.style.display = 'block';
        }
        if (pesoInput.value < 0) {
            pesoInput.classList.remove('is-valid');
            pesoInput.classList.add('is-invalid');
            pesoInput.nextElementSibling.style.display = 'block';
        }
    } else {
        tamanioInput.classList.remove('is-invalid');
        tamanioInput.classList.add('is-valid');
        tamanioInput.nextElementSibling.style.display = 'none';
        pesoInput.classList.remove('is-invalid');
        pesoInput.classList.add('is-valid');
        pesoInput.nextElementSibling.style.display = 'none';
    }
}

function validarEspecie(event) {
    let especieInput = document.querySelector('select[name="especie"]');
    if (especieInput.value == -1) {
        event.preventDefault();
        especieInput.classList.remove('is-valid');
        especieInput.classList.add('is-invalid');
        especieInput.nextElementSibling.style.display = 'block';
    } else {
        especieInput.classList.remove('is-invalid');
        especieInput.classList.add('is-valid');
        especieInput.nextElementSibling.style.display = 'none';
    }
}
function validarFoto(event) {
    let fotoInput = document.querySelector('input[name="foto"]');
    let fotoValue = fotoInput.value;
    let extensionesValidas = ['.jpg', '.jpeg', '.png', '.gif'];
    let esEnlaceImagen = false;
    for (let i = 0; i < extensionesValidas.length; i++) {
        if (fotoValue.endsWith(extensionesValidas[i])) {
            esEnlaceImagen = true;
            break;
        }
    }
    if (!esEnlaceImagen) {
        event.preventDefault(); 
        fotoInput.classList.remove('is-valid');
        fotoInput.classList.add('is-invalid');
        fotoInput.nextElementSibling.style.display = 'block'; 
    } else {
        fotoInput.classList.remove('is-invalid');
        fotoInput.classList.add('is-valid');
        fotoInput.nextElementSibling.style.display = 'none'; 
    }
}