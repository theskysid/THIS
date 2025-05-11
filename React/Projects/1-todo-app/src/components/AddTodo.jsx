import { useRef } from "react";
//import { useState } from "react";

function AddTodo({ onNewItem }) {

  const todoNameElement = useRef();
  const dueDateElement = useRef();

  //first we were re painting the whole page when a change occurs now we are using useref to just modify the values 
  // const [todoName, setTodoName] = useState();
  // const [dueDate, setDueDate] = useState();

  // const handleNameChange = (event) => {
  //   setTodoName(event.target.value);
  // };

  // const handleDateChange = (event) => {
  //   setDueDate(event.target.value);
  // };

  const handleAddButtonClicked = (e) => {
    e.preventDefault();

    const todoName = todoNameElement.current.value;
    const dueDate = dueDateElement.current.value;

    onNewItem(todoName, dueDate);

    todoNameElement.current.value = "";
    dueDateElement.current.value = "";

    // setDueDate("");
    // setTodoName("");
  };

  return (
    <div className="container text-center">
      <form className="row kg-row" onSubmit={handleAddButtonClicked}>
        <div className="col-6">
          <input
            type="text"
            placeholder="Enter Todo Here"
            ref={todoNameElement}
            // value={todoName}
            //onChange={handleNameChange}
          />
        </div>
        <div className="col-4">
          <input type="date" 
          ref={dueDateElement}
          //value={dueDate} 
          //onChange={handleDateChange} 
           />
        </div>
        <div className="col-2">
          <button
            type="submit"
            className="btn btn-success kg-button"
          >
            Add
          </button>
        </div>
      </form>
    </div>
  );
}

export default AddTodo;
