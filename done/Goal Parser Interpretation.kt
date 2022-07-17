fun main() {
    println(interpret("G()(al)"))
    println(interpret("G()()()()(al)"))
    println(interpret("(al)G(al)()()G"))
}

fun interpret(command: String): String {
    val size = command.length
    val stringBuilder = StringBuilder()
    var i = 0
    while (i < size) {
        when (command[i]) {
            'G' -> stringBuilder.append('G')
            ')' -> stringBuilder.append('o')
            'a' -> {
                stringBuilder.append("al")
                i += 2
            }
        }
        i += 1
    }
    return stringBuilder.toString()
}