import Item from "./Item.jsx";

function List(props) {
  return (
    <div>
      <h1>{props.label}</h1>
      <ul>
        {props.data.map((element) => (
          <Item text={element} />
        ))}
      </ul>
    </div>
  );
}

export default List;
