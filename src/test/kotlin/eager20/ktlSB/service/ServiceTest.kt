package eager20.ktlSB.service

import eager20.ktlSB.enums.FileRead
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

    @Test
    fun readFileUsingSpringBoot(){
        val rtn = sw.parsing(sw.readingPlatFile,"file.txt")
        println( rtn.toString() )
        val rtn2 =
            rtn.map { Pair(it.key, it.value.size) }
                .sortedWith(compareByDescending<Pair<String, Int>> { it.second }
                    .then(compareBy { it.first }))
                .map { it.first }.toList()
        println(rtn2.toString())

    }
}