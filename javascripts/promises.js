function createPromisis() {
    return new Promise(function exec(resolve, reject){
        setTimeout(function  f() {
        console.log("timer done");
reject("done");
    }, 3000);
});
}
console.log("timer started");
let x=createPromisis();
console.log("got a new promise");
x.then(function f(){
    console.log("promisis done");
}).catch(function g(){
    console.log("handel");
})
console.log("end");
