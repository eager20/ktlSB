package eager20.ktlSB.util

import org.junit.jupiter.api.Test

class ListTest {

    @Test
    fun funTest (){
        println(sum(10))
        println(sum(10, 49))
        println(sum(b = 22, a = 88))
        arrySum(23,45,23,3)
    }

    // void == Unit
    private fun sum(a: Int, b: Int = 900): Int = a + b

    private fun arrySum(vararg a: Int): Unit {
        a.asList().forEach { print("[$it]") }
        println( a.asList().joinToString(",")  )
        var tempSet = a.asList().map{it}.toSet()

        tempSet.forEach{ println (it)}
    }

//    val accountIds = items.map {
//        it.id
//    }.toSet()
}