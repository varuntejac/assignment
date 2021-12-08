import { Car } from "./Car"

class Truck extends Car {

    weight: number;
    constructor(s: number, r: number, c: string, w: number) {
        super(s, r, c);
        this.weight = w;
    }

    getSalePrice(): number {
        if (this.weight > 2000) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
        else {
            return super.getSalePrice() - (0.2 * super.getSalePrice());

        }

    }
}

var truck = new Truck(200, 2500000, "White", 3000);
console.log(truck.getSalePrice());