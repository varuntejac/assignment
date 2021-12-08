var GretestNumber = /** @class */ (function () {
    function GretestNumber() {
        this.A = 12;
        this.B = 25;
        this.c = 89;
    }
    GretestNumber.prototype.greatestNumber = function () {
        if (this.A > this.B && this.A > this.c) {
            return this.A;
        }
        else if (this.B > this.c && this.B > this.A) {
            return this.B;
        }
        else {
            return this.c;
        }
    };
    return GretestNumber;
}());
var n = new GretestNumber();
console.log(n.greatestNumber());
