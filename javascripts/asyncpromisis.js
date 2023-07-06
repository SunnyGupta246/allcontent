function createPromisis() {
    return new Promise(function exec(resolve, reject){
        setTimeout(function  f() {
        console.log("timer done");
reject("done");
    }, 3000);
});
}

async function consume(){
    try {
        console.log("inside function ");
    const response = await createPromisis();
    console.log("response is ",response);
        
    } catch (error) {
        console.log("handel",error);
    }
    
}
console.log("start");
consume();
console.log("end");