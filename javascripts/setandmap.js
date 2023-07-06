// let emptyset = new Set();
// console.log(emptyset.size)

// let myarr =[1,3,4,5,6];
// let newset = new Set([...myarr]);
// console.log(newset)



const myMap = new Map();

// Add new elements to the map
myMap.set("bar", "foo");
myMap.set(1, "foobar");

// Update an element in the map
myMap.set("bar", "baz");
console.log(myMap.get("bar"));
console.log(myMap.get(1));