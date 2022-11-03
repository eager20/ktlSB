package eager20.ktlSB.enums

enum class FileRead  (val readingPlatFile : (String) -> Map<String, List<String>>)
{
    FLAT({ fileName: String ->
        val resource: List<String> = org.springframework.core.io.ClassPathResource(fileName).inputStream.bufferedReader().readLines()
        resource.map {
            val item = it.split(",")
            kotlin.Pair(item[0], item[1])
        }.groupBy { it.first }
            .map { kotlin.Pair(it.key, convertPair(it.value)) }
            .toMap()


    }),
    CSV_FILE ({
        val resource: List<String> = org.springframework.core.io.ClassPathResource(it).inputStream.bufferedReader().readLines()
        resource.map {
            val item = it.split(",")
            Pair(item[0], item[1])
        }.groupBy { it.first }
            .map { Pair(it.key, convertPair(it.value)) }
            .toMap()
    });

}

private fun convertPair(src: kotlin.collections.List<kotlin.Pair<kotlin.String, kotlin.String>>): kotlin.collections.List<kotlin.String> {
    return src.map { it.second }.toList()
}



