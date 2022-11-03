package eager20.ktlSB.service

import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Component
import java.io.File

@Component
class ServiceWork {
    fun sum(src1: Int, src2 : Int) :Int {
        return src1 + src2
    }

    companion object {

        private fun convertPair(src: List<Pair<String, String>>): List<String> {
            return src.map { it.second }.toList()
        }



    }
    // 람다로 만들어진 함수 변수는 ing 를 붙여서 동작하는것을 표현한다.
    val readingPlatFile : (String) -> Map<String, List<String>> = { fileName: String ->
        val resource: List<String> = ClassPathResource(fileName).inputStream.bufferedReader().readLines()
        resource.map {
            val item = it.split(",")
            Pair(item[0], item[1])
        }.groupBy { it.first }
            .map { Pair(it.key, convertPair(it.value)) }
            .toMap()
    }

    fun parsing( parsing : (String) -> Map<String, List<String>>,
                 fileName: String ): Map<String, List<String>> {
        return parsing(fileName)
    }

    fun readFileLineByLineUsingForEachLine(fileName: String)
            = File(fileName).forEachLine { println(it) }

}