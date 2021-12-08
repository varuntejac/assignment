export class Car {
    speed: number;
    regularprice: number;
    color: string;

    constructor(s: number, r: number, c: string) {
        this.speed = s;
        this.regularprice = r;
        this.color = c;
    }

    getSalePrice(): number {
        return this.regularprice;
    }
}
/*var car = new Car(140, 1600000, "White");
console.log(car.getSalePrice());*/