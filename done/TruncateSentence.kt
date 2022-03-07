fun main() {
    println(truncateSentence("chopper is not a tanuki", 5))
}

fun truncateSentence(s: String, k: Int): String {
    val array = s.split(" ")
    val builder = StringBuilder()

    for (i in 0..(k-1))
        builder.append(array[i]).append(" ")
    return builder.toString().trim()
}