"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(carName, carModel, carColor) {
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
    }
    Car.prototype.startCar = function () {
        console.log("Car Starting " + this.carName);
    };
    Car.prototype.setCarName = function (CarName) {
        this.carName = CarName;
    };
    Car.prototype.getCarName = function () {
        return this.carName;
    };
    return Car;
}());
exports.Car = Car;
// let car: Car = new Car();
// car.startCar(); 
