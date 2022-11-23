fun main() {
    println(shiftingLetters("abc", intArrayOf(3,5,9)))
//    println(shiftingLetters("aaa", intArrayOf(1,2,3)))
//    println(shiftingLetters("zzz", intArrayOf(1,2,3)))
//    println(shiftingLetters("z", intArrayOf(52)))
//    println(shiftingLetters("z", intArrayOf(1)))
}

fun shiftingLetters(s: String, shifts: IntArray): String {
    var i = 0
    while (i < shifts.size) {
        shifts[i] %= 26
        i++
    }
    val sb = StringBuilder(); var times = shifts.sum(); i = 0
    while (i < shifts.size) {
        sb.append(shift(s[i], times))
//        println("$s\t$i\t$times\t${shift(s[i], times)}")
        times -= shifts[i]
        i++
    }
    return sb.toString()
}
fun shift(char: Char, times: Int): Char {
    val order: Int = char - 'a'
    val temp = if (order + times >= 26) (order + times) % 26 else order + times
//    println("$order\t$temp\t${(temp+97).toChar()}")
    return (temp + 97).toChar()
}