package ConditionalStatements

fun main(args: Array<String>) {
    var num = 50

    if (num < 100){
        println("Number is less than 100")
    }else{
        println("Number is greater than 100")
    }


    var tempratur =  23

    if (tempratur < 20) {
        println("tempratur is less than 20")
    }else if(tempratur < 25 && tempratur >= 20){
        println("Tempratur between 20 and 25")
    }else{
        println("tempratur is greater than 25")
    }


    var isLogin = false
    if (isLogin) println("Logged in succesful") else println("logged in failed")

    var a = 10
    var b = 20
    var max = if (a > b) a else b
    println(max)
}