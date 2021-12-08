class Tshirt {
    color: string;
    material: string;
    design: string;

    constructor(c: string, m: string, d: string) {
        this.color = c;
        this.material = m;
        this.design = d;
    }

    display(size: string) {
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
        console.log(size);
    }
}
var ts = new Tshirt("Blue", "lenin", "newstyle");
ts.display("small");

var ts1 = new Tshirt("White", "peterengland", "formal");
ts1.display("large");

var ts2 = new Tshirt("Black", "arrow", "newstyle");
ts2.display("xtra-large");
