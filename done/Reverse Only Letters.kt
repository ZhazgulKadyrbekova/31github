fun main() {
    println(reverseOnlyLetters("ab-cd"))
    println(reverseOnlyLetters("a-bC-dEf-ghIj"))
    println(reverseOnlyLetters("Test1ng-Leet=code-Q!"))
    println(reverseOnlyLetters("7_28]"))
}

fun reverseOnlyLetters(s: String): String {
    val iString = StringBuilder()
    val jString = StringBuilder()
    var i = 0; var j = s.length - 1
    while (i < j) {
        val isINmb = isLetter(s[i].toInt())
        val isJNmb = isLetter(s[j].toInt())
        if (isINmb && isJNmb) {
            iString.append(s[j])
            jString.insert(0, s[i])
            i++
            j--
        }
        else if (isINmb) {
            iString.append(s[i])
            j--
        }
        else if (isJNmb) {
            jString.insert(0, s[j])
            i++
        }
        else {
            jString.insert(0, s[j])
            iString.append(s[i])
            i++
            j--
        }
    }
    if (i == j) {
        iString.append(s[j])
    }
    return "$iString$jString"
}

fun isLetter(nmb: Int): Boolean {
    return nmb in 65..90 || nmb in 97..122
}