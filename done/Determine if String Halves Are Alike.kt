fun main() {
    println(halvesAreAlike("book"))
    println(halvesAreAlike("textbook"))
}

fun halvesAreAlike(s: String): Boolean {
    val size = s.length
    val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count1 = 0
    var count2 = 0
    for (i in 0 until size) {
        println(i)
        if (vowels.contains(s[i])) {
            println(s[i])
            if (i <= (size / 2)-1) count1++
            else count2++
            println(count1)
            println(count2)
        }
        println()
    }
    return count1 == count2
}