function Hello(){

   // let myName = 'Siddhant';
   let fullName = () => {
      return 'Siddhant Rastogi'
   }


   return <h3>
      Hello this is the future speaking. I am your {fullName()}
   </h3>
}

export default Hello;