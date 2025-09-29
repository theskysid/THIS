// let a =30;
// if(a>10){
//     let a = 50;
//     console.log(a);
// } else {
//     console.log("Inside else block");
// }
// console.log(a);

// function greeting(){
//     let message = "Hello, World!";
// }

// const msg1 =  greeting("Siddhant");let a =30;
// if(a>10){
//     let a = 50;
//     console.log(a);
// } else {
//     console.log("Inside else block");
// }
// console.log(a);

// function greeting(){
//     let message = "Hello, World!";
// }

// const msg1 =  greeting("Siddhant");
// console.log(msg1);


// console.log(msg1);


// const data = function greeting(msg){
//     return "hii .... hello" + msg;
// }
// const msgq = data(" Good morning");
// console.log(msgq);


// const data1 = (msg) => {
//     return "Arrow function " + msg;
// }
// const ans = data1("Siddhant");
// console.log(ans);


// const data = msg => msg;
// const ans = data("Siddhant");
// console.log(ans);

// // IIFE - Immediately Invoked Function Expression
// (()=>{
//     console.log("Hiiii");
// })();


// setTimeout(() => {
//     console.log("Hii from setTimeout");
// }, 2000);


// function greeting(msg = "Siddhant"){
//     console.log("hello " + msg);
// }
// greeting("Welcome to FSD training");

function selectLanguage(lang){
    let data;
    if(lang == 'Java'){
        function javaCompiler(){
            return "Java compiler";
        }
        data = javaCompiler();
    } else if(lang == 'JavaScript'){
        function jsCompiler(){
            return "JavaScript compiler";
        }
        data = jsCompiler();[]
    } else {
        data = "No language selected";
    }
    return data;
}

const ans = selectLanguage('sid');
console.log(ans);