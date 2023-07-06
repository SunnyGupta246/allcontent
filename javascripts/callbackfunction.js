// function h(x,fun)
// {
//     console.log(x*x);
// fun(x);
// }
// // h(10,function(){
// // console.log("done with call back");
// // })
// h(10,squr)
// function squr(n){
//     console.log(n*n);
// }



console.log("start");
setTimeout(function f(){
    console.log("setInterval done");
},3000)
setTimeout(function f(){
    console.log("execute code 2 ");
}, 500);
console.log("end");