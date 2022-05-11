package eager20.ktlSB.util

import org.junit.jupiter.api.Test

class lambdaTest {
    @Test
    fun lamdaTest(){
        val result  = callByValue(lambda())
        println(result)
    }

    fun callByValue(b:Boolean) : Boolean{
        println("## CallByValue Func~~!")
        return b
    }

    val lambda: () -> Boolean = {
        println("## Lambda Func~!")
        true
    }
}