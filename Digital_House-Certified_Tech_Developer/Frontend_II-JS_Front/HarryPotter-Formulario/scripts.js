window.onload = () => {
  const formInscripcion = document.forms.inscripcion;

  const nombre = formInscripcion.nombre;
  const contrasenia = formInscripcion.pass;
  const telefono = formInscripcion.tel;
  const hobbies = formInscripcion.hobbies;
  const nacionalidad = formInscripcion.nacionalidad;

  /* Otra forma de hacerlo es como sigue:
    const form = document.querySelector('form');
    const form = document.forms;    -> Esto es lo mismo que querySelector ya que trae todos los formularios del documento
    const form = document.forms[0];
    const nombre = form.querySelector('#nombre');
    const contrasenia = form.querySelector('#pass');
    const telefono = form.querySelector('#tel');
    const button = form.querySelector('button');
    */

    const boton = formInscripcion.querySelector("button");
    // const nombre = document.querySelector('#nombre').value;   -> Esta es una forma válida de pedir el valor
    // cnombre.onKeyDown = () => {};  -> Otra forma de agregar un evento

    const datos = new DatosInscripcion();
    boton.disabled = true;

    //eventListener del Nombre
    nombre.addEventListener("keyup",() => {
        datos.nombreCompleto = nombre.value.toLowerCase().trim();

        if(datos.nombreCompleto.length>8){
            console.log("Max. caracteres excedidos");
        }

        const partesNombre = datos.nombreCompleto.split(' ');
        if(partesNombre.length>=2){
            nombre.classList.add('error');
            boton.disabled = false;
        }
        else{
            nombre.classList.remove('error');
            boton.disabled = true;
        }

        partesNombre.forEach(parte =>{
            if(parte.length>=2){
                nombre.classList.remove('error');
            }
            else{
                nombre.classList.add('error');
            }
        })
    });

    //eventListener de Contraseña
    contrasenia.addEventListener("keyup",() =>{
        datos.contrasenia = contrasenia.value.trim();
    });

    telefono.addEventListener("keyup",() =>{
        const number = parseInt(telefono.value);

        if(isNaN(number)){
            button.disabled = true;
            datos.telefono = null;
        }else{
            button.disabled = false;
            datos.telefono = telefono.value;
        }
    });

    formInscripcion.addEventListener("submit",(event) => {
        event.preventDefault();

        /*  const ejemplo = [{prop:'checked'},{prop:'unchecked'},{prop:'checked'},]
        
            cons hobbiesSelected = ejemplo.filter(ej =>{
                return ej.prop == 'checked'
            })
        */

        hobbies.forEach(hobbie => {
            if(hobbie.checked){
                datos.hobbies.push(hobbie.value);
            }
        });
    });
};
