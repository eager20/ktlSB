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
        println( readPlatFile("file.txt").toString() )

    }


    fun readFileLineByLineUsingForEachLine(fileName: String)
            = File(fileName).forEachLine { println(it) }


    fun readPlatFile(fileName: String):Map<String, List<String>>{
        val resource: List<String> = ClassPathResource(fileName).inputStream.bufferedReader().readLines()
        return resource.map {
            val item = it.split(",")
            Pair(item[0], item[1])
        }.groupBy { it.first }
            .map { Pair(it.key, convertPair(it.value)) }.toMap()
    }

    fun convertPair(src : List<Pair<String, String>>) : List<String>{
        return src.map { it.second }.toList()
    }
}