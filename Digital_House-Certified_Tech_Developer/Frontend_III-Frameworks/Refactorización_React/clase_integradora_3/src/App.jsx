import "./App.css";
import Nav from './Nav.jsx';
import List from './List.jsx';

function App() {
  const navigation = ["Home", "About", "Contact"];
  const avaibleProducts = ["Tomate", "Manzana", "Peras"];
  const unavaibleProducts = ["Cebolla", "Bananas"];

  return (
    <div>
      <Nav data={navigation} />
      <List data={avaibleProducts} label={"Productos disponibles"}/>
      <List data={unavaibleProducts} label={"Productos no disponibles"}/>
    </div>
  );
}

export default App;
