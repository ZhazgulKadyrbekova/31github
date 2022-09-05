fun main() {
//    val arr = uncommonFromSentences("this apple is sweet", "this apple is sour")
//    val arr = uncommonFromSentences("apple apple", "banana")
    val arr = uncommonFromSentences("s z z z s","s z ejt")
    for (i in arr)
        println(i)
}

fun uncommonFromSentences(s1: String, s2: String): Array<String> {
    val first = s1.split(" ").groupingBy { it }.eachCount().toMutableMap()
    val second = s2.split(" ").groupingBy { it }.eachCount().toMutableMap()
    for (entry in second) {
        if (!first.keys.contains(entry.key)) first[entry.key] = entry.value
        else first[entry.key] = first[entry.key]!! + entry.value
    }

    return first.filter { it.value == 1 }.map { it.key }.toTypedArray()
}