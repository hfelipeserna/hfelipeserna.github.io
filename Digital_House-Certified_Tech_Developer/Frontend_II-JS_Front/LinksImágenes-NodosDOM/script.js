/*const urlImagen1 = prompt('Ingrese la URL de la imagen 1 por favor');
console.log(urlImagen1);
const imagen1 = document.querySelector('#imagen-1');
imagen1.setAttribute('src',urlImagen1);
imagen1.setAttribute('width','300px');*/

const imagenes = document.querySelectorAll('.imagen');
const link = document.querySelectorAll('.rutas-img');
imagenes.forEach((imagen,i)=>{
    const urlImagen = prompt('Ingrese la URL de la imagen '+ (i+1) +' por favor');
    imagen.setAttribute('src',urlImagen);
    link[i].setAttribute('href',urlImagen);
    link[i].setAttribute('target','_blank');
    imagen.setAttribute('width','400px');
})

/* ETAPA 3
- Nodo padre: '.tarjeta'
- Nodo hijo repetitivo: a , img
- Explicación: 
Simplemente al identificar que el nodo padre es la clase .tarjetas,
capturamos este elemento con un querySelectorAll, para saber también
cuantas tarjetas hay en el documento HTML, y recorrerlas con un 
forEach. Se define un template HTML donde la urlImagen será la variable
que se irá pidiendo al usuario con cada iteración, y se agregará al 
HTML con un innerHTML.

const tarjetas = document.querySelectorAll('.tarjetas');
tarjetas.forEach((tarjeta,i)=>{
    const urlImagen = prompt('Ingrese la URL de la imagen '+ (i+1) +' por favor');
    tarjetas.innerHTML += myTemplate;
})

const myTemplate=` 
<a class="rutas-img" href=${urlImagen} target='_blank'>
<img src=${urlImagen} class="imagen" alt="imagen-1" id="imagen-1" style="width:400px;"/></a>
`;

*/