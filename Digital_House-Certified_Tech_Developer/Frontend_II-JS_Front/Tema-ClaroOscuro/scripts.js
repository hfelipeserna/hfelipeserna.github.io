function darkLightFunction() {
  confirm("Desea cambiar el estilo?");
  const body = document.querySelector("body");
  body.classList.toggle("dark");
}
