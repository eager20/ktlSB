package eager20.ktlSB.util

import org.junit.jupiter.api.Test
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import java.io.File


class FileReadTest {

    @Test
    fun readFileUseingForEachLine(){
        readFileLineByLineUsingForEachLine("/Users/eager30/Documents/WSP/ktlSB/src/main/resources/file.txt")

    }


    @Test
    fun readFileUsingSpringBoot(){
        val resource: Resource = ClassPathResource("file.txt")
        val lines = resource.inputStream.bufferedReader().readLines()
        println(lines)

    }


    fun readFileLineByLineUsingForEachLine(fileName: String)
            = File(fileName).forEachLine { println(it) }
}