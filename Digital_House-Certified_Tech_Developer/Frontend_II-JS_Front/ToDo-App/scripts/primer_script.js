window.onload = () => {
  crearTareas();
  agregarTarea();
};

function crearTareas() {
  tareas.forEach((tarea) => {
    renderizarTarea(tarea);
  });
}

function renderizarTarea(tarea) {
  const template = `
    <li class="tarea">
        <div class="not-done"></div>
        <div class="descripcion">
            <p class="nombre">${tarea.nombre}</p>
            <p class="timestamp">Creado el: ${tarea.fecha}</p>
        </div>
    </li>
    `;

    const contenedorTareas = document.querySelector('ul.tareas-pendientes');
    contenedorTareas.innerHTML += template;
}

function agregarTarea(){
    const nuevaTarea = {nombre: 'tarea1', fecha: '18/06/89', estado: false};
    const nombreNuevaTarea = prompt('Ingrese el nombre de la tarea');

    nuevaTarea.nombre = nombreNuevaTarea;
    renderizarTarea(nuevaTarea);
}

const tareas = [
  { nombre: "tarea1", fecha: "18/06/89", estado: false },
  { nombre: "tarea1", fecha: "18/06/89", estado: false },
  { nombre: "tarea1", fecha: "18/06/89", estado: false },
];

// 1 - Representar los datos (tareas) en JavaScript.
// 2 - Hacer un template para representar las tareas.
//  2.1 - Tomar el código HTML que se repite y lo traemos a JavaScript.
//  2.2 - Verificar donde incluiríamos nuestro template.
//  2.3 - Incluir el template en nuestro contenedor.
// 3 - Representar una de las tareas de JavaScript en nuestro template.
// 4 - Hacer que se renderize el template por cada tarea.
// 5 - Refactorización y buenas prácticas.
//  5.1 - Ver si se puede separar en funciones mas claras.
//  5.2 - Ordenar el código.