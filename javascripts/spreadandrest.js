const arr1 =[1,2,3,4];
const arr2=[5,6,7,8];
const arr3=[...arr1,...arr2];    //use spread by seperate one
console.log(arr3);

function testone(){
    console.log(arguments)
}
testone(1,2,3,4);


//rest
function manyarr(...args){
    let finalarr=args.map(e => e);
    console.log(finalarr);
}
manyarr(1,2,3,4);