window.onload = () => {
  const formInscripcion = document.forms.inscripcion;

  const nombre = formInscripcion.nombre;
  const contrasenia = formInscripcion.pass;
  const telefono = formInscripcion.tel;
  const hobbies = formInscripcion.hobbies;
  const nacionalidad = formInscripcion.nacionalidad;

  console.log(hobbies)
  console.log(nacionalidad.value)

  const boton = formInscripcion.querySelector('button');

  const datos = {
    nombreCompleto: null,
    contrasenia: null,
    telefono: null,
    hobbies: [],
    nacionalidad: null
  }

  nombre.addEventListener('keyup', () => {
    datos.nombreCompleto = nombre.value.toLowerCase().trim();
  })

  contrasenia.addEventListener('keyup', () => {
    datos.contrasenia = contrasenia.value.trim();
  })

  telefono.addEventListener('keyup', () => {
    const number = parseInt(telefono.value);

    if (isNaN(number)) {
      boton.disabled = true;
      datos.telefono = null;
    } else {
      boton.disabled = false;
      datos.telefono = telefono.value;
    }

  })

  formInscripcion.addEventListener('submit', (event) => {
    event.preventDefault();

    // const ejemplo = [{ prop: 'checked' }, { prop: 'unchecked' }, { prop: 'checked' }]

    // const hobbiesSelected = ejemplo.filter(ej => {
    //   return ej.prop == 'checked'
    // })

    // console.log(hobbiesSelected)

    hobbies.forEach( hobbie => {
      if(hobbie.checked) {
        datos.hobbies.push(hobbie.value);
      }
    }) 
    console.log(datos);
  })

}

// class NombreClase {
//   constructor(nombre) {
//     this.propiedad = nombre
//   }

// }
// new NombreClase('fernando');

// nombre completo
// contraseña
// telefono