const body = document.querySelector("body");

const eleccionUsuario = confirm("Quiere aplicar el tema oscuro?");

if (eleccionUsuario) {
  body.classList.toggle("dark");
}

const contenedor = document.querySelector(".contenedor");

function crearNoticia(noticias) {
  let template;
  noticias.forEach(noticia => {
    template = `
    <div class="item">
        <img src="${noticia.urlImagen}"> 
        <h2>${noticia.titulo}</h2>
        <p>${noticia.contenido}</p>
    </div>
    `;
    contenedor.innerHTML += template;
  });
};


const noticias = [
  {
  titulo: "El tigre",
  urlImagen:"./imagenes/tiger.jpg",
  contenido: `El tigre (Panthera tigris) es una de las especies​ de la subfamilia de los panterinos (familia Felidae)
  pertenecientes al género Panthera. Se encuentra solamente en el continente asiático; es un predador carnívoro y
  es la especie de félido más grande del mundo junto con el león pudiendo alcanzar ambos un tamaño comparable al de
  los fósiles de félidos de mayor tamaño.`,
},
{
  titulo: "El leon",
  urlImagen: "./imagenes/leon.jpg",
  contenido: ` El león (Panthera leo) es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del
  género Panthera. Los leones salvajes viven en poblaciones cada vez más dispersas y fragmentadas del África
  subsahariana (a excepción de las regiones selváticas de la costa del Atlántico y la cuenca del Congo) y una
  pequeña zona del noroeste de India`,
},
{
  titulo: "El leopardo",
  urlImagen: "./imagenes/leopardo.jpg",
  contenido: ` El leopardo (Panthera pardus) es un mamífero carnívoro de familia de los félidos. Al igual que tres de los demás
  félidos del género Panthera: el león, el tigre y el jaguar, están caracterizados por una modificación en el
  hueso hioides que les permite rugir. También se lo conoce como pantera parda y, cuando presenta un pelaje
  completamente oscuro como pantera negra (melánico).`,
}
];

crearNoticia(noticias);