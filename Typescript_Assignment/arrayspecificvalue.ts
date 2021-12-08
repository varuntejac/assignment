class SpecificValue {
    myArr: number[] = [12, 34, 54, 66, 78, 55, 79, 43, 23];

    n: number = 79;
    test: Boolean = false;
    index() {
        for (var i = 0; i < this.myArr.length; i++) {
            if (this.myArr[i] == this.n) {
                this.test = true;
                break;
            }
        }
        if (this.test) {
            console.log("found");
        }
        else {
            console.log("not found");
        }

    }
}
var N = new SpecificValue();
N.index();