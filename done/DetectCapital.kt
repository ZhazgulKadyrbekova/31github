fun main() {
    println(detectCapitalUse("USA"))
    println(detectCapitalUse("FlaG"))
    println(detectCapitalUse("mL"))
}

fun detectCapitalUse(word: String): Boolean {
    val index = word.length - 1
    val isCapital = word[0].toInt() < 96
    var capitalCount = 0
    var notCapitalCount = 0

    for (i in 1..index) {
        val asciiLetter = word[i].toInt()

        if (asciiLetter > 96)   notCapitalCount++
        else                    capitalCount++

        if (!isCapital && capitalCount != 0) return false
        if (!(capitalCount == 0 || notCapitalCount == 0)) return false
    }
    return true
}