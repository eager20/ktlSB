package eager20.ktlSB.utils

class FileReadUtil {

    companion object {
        fun parsing(
            parsing: (String) -> Map<String, List<String>>,
            fileName: String
        ): Map<String, List<String>> {
            return parsing(fileName)
        }

    }
}

