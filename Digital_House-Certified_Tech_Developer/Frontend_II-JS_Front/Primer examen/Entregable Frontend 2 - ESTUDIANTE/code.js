let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: ""
};

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  datosPersona.nombre = window.prompt("Ingresa tu nombre");
  datosPersona.edad = new Date().getFullYear()-parseInt(window.prompt("Ingresa el año en que naciste"));
  datosPersona.ciudad = window.prompt("Ingresa la ciudad donde vives");
  if(window.confirm("¿Te interesa Javascript?")){
    datosPersona.interesPorJs ='Si'
  }else{datosPersona.interesPorJs ='No'};
}



function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  let containerNombre = document.querySelector("#nombre");
  let containerEdad = document.querySelector("#edad");
  let containerCiudad = document.querySelector("#ciudad");
  let containerInteresJS = document.querySelector("#javascript");
  containerNombre.innerHTML+=`${datosPersona.nombre}`;
  containerEdad.innerHTML+=`${datosPersona.edad}`;
  containerCiudad.innerHTML+=`${datosPersona.ciudad}`;
  containerInteresJS.innerHTML+=`${datosPersona.interesPorJs}`;
}


/* ------------------------- NO MODIFICAR ESTE ARRAY ------------------------ */
const listado = [
  {
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://image.flaticon.com/icons/png/512/919/919828.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://image.flaticon.com/icons/png/512/919/919851.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  contenedor = document.querySelector("#fila");
  listado.forEach(elemento =>{
    const caja = document.createElement("div");
    const p1 = document.createElement("p");
    const p2 = document.createElement("p");
    const imagen = document.createElement("img");
    const lenguaje = document.createTextNode("Lenguajes: "+elemento.lenguajes);
    const bimestre = document.createTextNode("Bimestre: "+elemento.bimestre);
    p1.appendChild(lenguaje);
    p2.appendChild(bimestre);
    caja.appendChild(imagen);
    caja.appendChild(p1);
    caja.appendChild(p2);
    contenedor.appendChild(caja);
    caja.classList.toggle("caja");
    p1.classList.toggle("lenguajes");
    p2.classList.toggle("bimestre");
    if(!imagen.hasAttribute("src")){
      imagen.setAttribute("src",elemento.imgUrl);
    }
  })
}


function mostrarYOcultarDescripcionCompleta() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
 aboutMe=document.querySelector(".sobre-mi");
 aboutMe.classList.toggle("sobre-mi-completo");
}
