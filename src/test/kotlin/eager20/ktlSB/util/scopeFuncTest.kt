package eager20.ktlSB.util

import org.junit.jupiter.api.Test

class scopeFuncTest {

    @Test
    fun scopeFuncTest(){
        var car = Car("ray")

        with(car){
            name = "root"
        }
        println("with "+car)
        println("===========================")

        var tmp = car.also{
            it.name="pp"
            "test"
        }
        println("also USE it! ")
        println("also "+car)
        println("also rslt "+tmp)

        var tcar = car.apply{
            name = "poo"
        }
        println("apply "+car)
        println("apply rslt "+tcar)
        println("===========================")

        var tmp1 = car.let{
            it.name="pp"
            "test"
        }
        println("let USE it! ")
        println("let "+car)
        println("let rslt "+tmp1)

        var tmp2 = car.run{
            name="pp"
            "test"
        }
        println("run "+car)
        println("run rslt "+tmp2)


    }

    data class Car(var name : String)
}