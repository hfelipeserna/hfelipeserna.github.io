window.onload = () => {
  const form = document.forms.searchForm;

  renderizarHistorial();

  form.onsubmit = (event) => {
    event.preventDefault();
    const valor = form.busqueda.value;
    const url = `https://www.google.com/search?q=${valor}`;
    redireccionarBusqueda(url);
    guardarBusqueda(valor);
    renderizarBusqueda(valor);
  };
};

function redireccionarBusqueda(url) {
  window.open(url, "_blank");
}

function guardarBusqueda(valor){
    const historialStorage = localStorage.getItem("historial");
    const historial = historialStorage !== null? historialStorage.split(","):[];
    historial.push(valor);
    localStorage.setItem("historial",historial.join(","));
}

function renderizarBusqueda(texto) {
  const template = `<p>${texto}</p>`;
  const div = document.querySelector("#busquedas-realizadas");
  div.innerHTML += template;
}

function renderizarHistorial() {
  const historialStorage = localStorage.getItem("historial");
  const historial =
    historialStorage !== null ? historialStorage.split(",") : [];
  historial.forEach((texto) => {
    renderizarBusqueda(texto);
  });
}
