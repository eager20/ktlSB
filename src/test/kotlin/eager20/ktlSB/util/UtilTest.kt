package eager20.ktlSB.util

import org.junit.jupiter.api.Test
import java.util.stream.Collectors

class UtilTest {
    @Test
    fun safiycallElvis(){
        var temp :String? = "TEST"
        //temp = null
        println("TEST ${temp?.length ?: -1}")
    }

    @Test
    fun ternary (){
        var temp :String = if (true) "true" else "false"
        println("TEST $temp")
    }

    @Test
    fun ascii (){
        val asciiValue = 94

        // Get ASCII value of exampleChar
        val charValue = asciiValue.toChar()

        println("========================================")
        println("Character value of $asciiValue is [$charValue]")
        println("========================================")

    }


    @Test
    fun orTest (){
        var num1 = 12
        var num2 = 25
        var result: Int

        println( num1 or num2 )
    }



}