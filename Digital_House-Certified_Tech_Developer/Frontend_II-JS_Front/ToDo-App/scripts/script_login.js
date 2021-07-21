window.onload = () => {
  const formLogin = document.forms.formLogin;

  const nombre = formLogin.nombre;
  const contasenia = formLogin.contasenia;
  const repetirContrasenia = formLogin.repetirContrasenia;
  const email = formLogin.email;

  formLogin.addEventListener("submit", (e) => {
    e.preventDefault();
    const nombreValido = validarNombre(nombre.value);
    const contrValido = validarContrasenia(
      contrasenia.value,
      repetirContrasenia.value
    );
    const emailValido = validarEmail(email.value);

    if(nombreValido && contrValido && emailValido){
        const datosUsuario = new DatosUsuario();
        console.log("3-check OK!");
    }
  });
};

function validarNombre(valor) {
  //const expresion = new RegExp('[0-9]'); También es válido, expresión regular como objeto
  const expresion = /[0-9]/;
  const test = expresion.test(valor);
  const longitudCorrecta = valor.length > 2;
  return !test && longitudCorrecta;
}

function validarContrasenia(contrasenia, repetirContrasenia){
    const coincidentes = contrasenia == repetirContrasenia;
    const longitudCorrecta = contrasenia.length > 7;
    return coincidentes && longitudCorrecta;
}

function validarEmail(email){
    //[A-z]+@[A-z]+.[A-z]{3}(.[a-z]+)? Expresión de email para validar, el último son coincidir 3 veces
    const expresion = /[A-z]+@[A-z]+.[A-z]{3}(.[a-z]+)?/;
    const test = expresion.test(email);
    return test;
}
