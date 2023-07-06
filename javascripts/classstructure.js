class sunny {
 
    constructor(b, i, s) {
      this.beheavare = b;
      this.IQ = i;
      this.smartness = s;
    }

  my() {
    console.log("function is called",this.IQ);
  }
}
const p = new sunny("good", 100, 90);
console.log(p);
p.my();

