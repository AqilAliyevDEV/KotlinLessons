package oop

class ClassName {
    //property
    //methods
}


fun main(args: Array<String>) {

    var lamp = Lamp()
    lamp.isOn = true
    lamp.turnOff()
    lamp.turnOn()

    var lamp2 = Lamp()
    lamp2.isOn = true

    var mercedes = Car()
    mercedes.color = "Silver"
    mercedes.model = 2017
    mercedes.working()
    mercedes.accelerate()


}


class Lamp {
    var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }
}