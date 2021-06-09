function darkLightFunction() {
  const darkLight = confirm("Desea cambiar el estilo?");
  const body = document.querySelector("body");

  if (darkLight) {
    body.classList.toggle("dark");
  }
}
