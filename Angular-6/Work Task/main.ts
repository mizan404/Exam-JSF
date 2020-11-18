export class Car {
    constructor(private carName?: string, private carModel?: number, private carColor?: string) {
    }
    startCar() {
        console.log("Car Starting " + this.carName);

    }
    setCarName(CarName: string) {
        this.carName = CarName;
    }
    getCarName() {
        return this.carName;

    }

}
// let car: Car = new Car();
// car.startCar(); 
