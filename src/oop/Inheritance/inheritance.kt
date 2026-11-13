package oop.Inheritance

fun main(args: Array<String>) {

    var car = Car()
    car.model = 2017
    car.startEngine()

    var vehicle = Vehicle()
    vehicle.stopEngine()
}

open class Vehicle(var model: Int? = null, var color: String? = null) {
    fun startEngine() = println("Engine started")
    fun accelerate() = println("Engine accelerated")
    fun stopEngine() = println("Engine stopped")
}

open class WheeledVehicle(var wheel: Boolean = true): Vehicle(){

}

class Car: WheeledVehicle(){

}