function TodoItem(){
   let todo = "Buy Milk";
   let tododate = '25-03-2025'
   return (
     <div class="container text-center">
       <div class="row">
         <div class="col-4">{todo}</div>
         <div class="col-4">
           {tododate}
         </div>
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