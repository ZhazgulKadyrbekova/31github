fun main() {
    println(addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8,13,15)))
}

fun addSpaces(s: String, spaces: IntArray): String {
    val sb = StringBuilder()
    var i = 0; var k = 0
    while (k < spaces.size) {
        val space = spaces[k++]
        sb.append(s.substring(i, space)).append(" ")
        i = space
    }
    sb.append(s.substring(i))
    return sb.toString()
}
