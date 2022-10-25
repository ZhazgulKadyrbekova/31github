fun main() {
    println(evaluate("(name)is(age)yearsold", listOf(listOf("name","bob"), listOf("age","two"))))
}

fun evaluate(s: String, knowledge: List<List<String>>): String {
    val map = knowledge.map { pair ->
        "(${pair[0]})" to pair[1]
    }.toMap()
    val stringBuilder = StringBuilder(); var i = 0
    while (i < s.length) {
        val char = s[i]
        if (char == '(') {
            val closingIndex = s.indexOf(')', i)
            val key = s.substring(i, closingIndex + 1)
            stringBuilder.append(map[key] ?: '?')
            i = closingIndex
        } else stringBuilder.append(char)
        i++
    }

    return stringBuilder.toString()
}