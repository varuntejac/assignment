var Reverse = /** @class */ (function () {
    function Reverse() {
        this.myArr = [12, 34, 45, 67, 88, 33];
    }
    Reverse.prototype.index = function () {
        for (var i = this.myArr.length - 1; i >= 0; i--) {
            console.log(this.myArr[i]);
        }
    };
    return Reverse;
}());
var r = new Reverse();
r.index();
