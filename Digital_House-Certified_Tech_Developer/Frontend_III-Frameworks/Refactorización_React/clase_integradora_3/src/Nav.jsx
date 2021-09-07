import Item from "./Item.jsx";

function Nav(props) {
  return (
    <nav>
      <ul>
        {props.data.map((elemento) => (
          <Item text={elemento} />
        ))}
      </ul>
    </nav>
  );
}

export default Nav;
