function TodoItem({ todoName, tododate }) {

  return (
    <div class="container text-center">
      <div class="row">
        <div class="col-4">{todoName}</div>
        <div class="col-4">{tododate}</div>
        <div class="col-2">
          <button type="button" class="btn btn-danger">
            Delete
          </button>
        </div>
      </div>
    </div>
  );
}

export default TodoItem;