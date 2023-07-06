const a = {
    good : true,

}
const b = {
   areyouthere :"yes",
}
Object.setPrototypeOf(a, b);
console.log(a.areyouthere);