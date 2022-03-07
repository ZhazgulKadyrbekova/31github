fun main() {
//    val arr = findWords(arrayOf("Hello","Alaska","Dad","Peace"))
//    val arr = findWords(arrayOf("omk"))
    val arr = findWords(arrayOf("adsdf","sfd"))
    for (i in arr)
        println("i\t$i")
}

fun findWords(words: Array<String>): Array<String> {
    val fir = "qwertyuiopQWERTYUIOP"
    val sec = "asdfghjklASDFGHJKL"
    val thir = "zxcvbnmZXCVBNM"
    val resList = mutableListOf<String>()
    var row: Int

    for (word in words) {
        row = -1
        val index = word.length - 1
        var count = 0
        for (i in 0..index) {
            if (i == 0)
                row =   if (fir.contains(word[i])) 1
                        else if (sec.contains(word[i])) 2
                        else 3
            else {
                if (fir.contains(word[i]) && row == 1)
                    count++
                else if (sec.contains(word[i]) && row == 2)
                    count++
                else if (thir.contains(word[i]) && row == 3)
                    count++
            }
        }
        if (count == index)
            resList.add(word)
    }

    return resList.toTypedArray()
}
