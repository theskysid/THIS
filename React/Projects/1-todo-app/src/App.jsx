import AddTodo from "./components/AddTodo";
import AppName from "./components/AppName";
import TodoItem from "./components/TodoItem";


function App() {
  return (
    <center class="todo-container">
      <AppName />
      <AddTodo />
      <TodoItem />
    </center>
  );
}


export default App;
