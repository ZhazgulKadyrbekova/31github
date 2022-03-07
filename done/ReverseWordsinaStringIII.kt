fun main() {
    println(reverseWords("Let's take LeetCode contest"))
}

fun reverseWords(s: String): String {
    val arr = s.split(" ")
    val stringBuilder = StringBuilder()
    for (i in arr) {
         stringBuilder.append(i.reversed()).append(" ")
    }
    return stringBuilder.toString().trim()
}
