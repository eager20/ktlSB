package eager20.ktlSB.util

import eager20.ktlSB.service.ServiceWork
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File

@SpringBootTest
class FileReadTest {

    @Autowired
    final lateinit var serviceWork: ServiceWork

    @Test
    fun readFileUseingForEachLine(){
        //serviceWork.readFileLineByLineUsingForEachLine("/Users/eager30/Documents/WSP/ktlSB/src/main/resources/file.txt")

    }


    @Test
    fun readFileUsingSpringBoot(){
        val rtn = serviceWork.parsing(ServiceWork.readingPlatFile,"file.txt")
        println( rtn.toString() )
        val rtn2 =
            rtn.map { Pair(it.key, it.value.size) }
                .sortedWith(compareByDescending<Pair<String, Int>> { it.second }
                    .then(compareBy { it.first }))
                .map { it.first }.toList()
        println(rtn2.toString())

    }






}