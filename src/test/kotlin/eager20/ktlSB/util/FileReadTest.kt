package eager20.ktlSB.util

import eager20.ktlSB.enums.FileRead
import eager20.ktlSB.utils.FileReadUtil.Companion.parsing
//import eager20.ktlSB.utils.parsing // 최상위 함수!
import org.junit.jupiter.api.Test

class FileReadTest {

    @Test
    fun readFileUseingForEachLine(){
        //serviceWork.readFileLineByLineUsingForEachLine("/Users/eager30/Documents/WSP/ktlSB/src/main/resources/file.txt")

    }

    @Test
    fun readFileUsingSpringBoot(){
        // 클래스 밖에 놓으면 최상위 함수로 아래와 같이 쓸수 있다.
        val rtn = parsing(FileRead.FLAT.readingPlatFile,"file.txt")
        println( rtn.toString() )
        val rtn2 =
            rtn.map { Pair(it.key, it.value.size) }
                .sortedWith(compareByDescending<Pair<String, Int>> { it.second }
                    .then(compareBy { it.first }))
                .map { it.first }.toList()
        println(rtn2.toString())

    }






}