package eager20.ktlSB.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ServiceTest {

    @Autowired
    final lateinit var sw : ServiceWork

    @Test
    fun study(){
        var temp = sw.sum(1,2)
        println("TEST $temp")
    }

    @Test
    fun ascii(){
        val code: Int = 65
        val chFromCode : Char = code.toChar()

        println("ascii: $chFromCode")
    }
}