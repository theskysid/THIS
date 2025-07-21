function MapMethod() {
  let foodItems = ["Dal", "Peanut Butter", "Chocolate", "Chicken"];

  return (
    <>
      <h1>Healthy Food items </h1>

      <ul className="list-group">
        {foodItems.map((item) => (
          <li key={item} className="list-group-item">
            {item}
          </li>
        ))}
      </ul>
    </>
  );
}

export default MapMethod;
