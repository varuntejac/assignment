"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(s, r, c, w) {
        var _this = _super.call(this, s, r, c) || this;
        _this.weight = w;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            return _super.prototype.getSalePrice.call(this) - (0.1 * _super.prototype.getSalePrice.call(this));
        }
        else {
            return _super.prototype.getSalePrice.call(this) - (0.2 * _super.prototype.getSalePrice.call(this));
        }
    };
    return Truck;
}(Car_1.Car));
var truck = new Truck(200, 2500000, "White", 3000);
console.log(truck.getSalePrice());
