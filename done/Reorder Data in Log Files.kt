import kotlin.collections.ArrayList

fun main() {
    val arr = reorderLogFiles(arrayOf("a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"))
    for (i in arr)
        println(i)
}

fun reorderLogFiles(logs: Array<String>): Array<String> {
    val resList = ArrayList<String>()
    val lettersList = ArrayList<String>()

    for (log in logs) {
        if (isLetterLogs(log)) {
            lettersList.add(log)
        }
    }

//    Collections.sort(lettersList, { s1: String, s2: String ->
//        val exceptFirstWordOfS1: String = s1.substring(s1.indexOf(" "), s1.length)
//        val exceptFirstWordOfS2: String = s2.substring(s2.indexOf(" "), s2.length)
//        if (exceptFirstWordOfS1 == exceptFirstWordOfS2) s1.compareTo(s2)
//        else exceptFirstWordOfS1.compareTo(exceptFirstWordOfS2)
//    })

    lettersList.sortWith { s1: String, s2: String ->
        val exceptFirstWordOfS1: String = s1.substring(s1.indexOf(" "), s1.length)
        val exceptFirstWordOfS2: String = s2.substring(s2.indexOf(" "), s2.length)
        if (exceptFirstWordOfS1 == exceptFirstWordOfS2) s1.compareTo(s2)
        else exceptFirstWordOfS1.compareTo(exceptFirstWordOfS2)
    }

    for (i in lettersList) {
        resList.add(i)
    }

    for (log in logs) {
        if (!isLetterLogs(log)) {
            resList.add(log)
        }
    }

    return resList.toTypedArray()
}

fun isLetterLogs(log: String): Boolean {
    val char = log.split(" ")[1][0]
    return char.isLetter()
}
