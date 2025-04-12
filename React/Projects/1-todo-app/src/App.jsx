import AddTodo from "./components/AddTodo";
import AppName from "./components/AppName";
import TodoItem from "./components/TodoItem";


function App() {
  return (
    <center class="todo-container">
      <AppName />
      <AddTodo />
      <TodoItem todoName={'Buy milk'} tododate={'23-10-2024'}/>
    </center>
  );
}


export default App;
