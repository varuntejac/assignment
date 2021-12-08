"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(s, r, c) {
        this.speed = s;
        this.regularprice = r;
        this.color = c;
    }
    Car.prototype.getSalePrice = function () {
        return this.regularprice;
    };
    return Car;
}());
exports.Car = Car;
/*var car = new Car(140, 1600000, "White");
console.log(car.getSalePrice());*/ 
