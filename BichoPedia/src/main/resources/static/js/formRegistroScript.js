let formulario = document.forms.formEncuentro;
let fechaInput = formulario.elements.fecha;

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

let passwdInput = document.getElementById('passwd');
let confirmPasswdInput = document.getElementById('confirm-passwd');

    confirmPasswdInput.addEventListener('input', () => {
        if (passwdInput.value !== confirmPasswdInput.value) {
            confirmPasswdInput.setCustomValidity('Las contraseñas no coinciden');
        } else {
            confirmPasswdInput.setCustomValidity('');
        }
    });