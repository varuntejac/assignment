var SpecificValue = /** @class */ (function () {
    function SpecificValue() {
        this.myArr = [12, 34, 54, 66, 78, 55, 79, 43, 23];
        this.n = 79;
        this.test = false;
    }
    SpecificValue.prototype.index = function () {
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
    };
    return SpecificValue;
}());
var N = new SpecificValue();
N.index();
