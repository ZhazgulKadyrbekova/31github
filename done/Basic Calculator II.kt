fun main() {
    println(calculate("2*3*4"))
    println(calculate("3+2*2+4"))
    println(calculate(" 3/2 "))
    println(calculate(" 3+5 / 2 "))
    println(calculate("3+2*24"))
}

fun calculate(string: String): Int {
    val s = string.replace(" ","")
    val numbers = mutableListOf<Int>()
    val operations = mutableListOf<Char>()
    var prev = 0; var i = 0
    while (i < s.length) {
        val char = s[i]
        if (isOperation(char)) {
            if (hasPriority(char)) {
                val next = getNextNumber(s, i+1)
                if (char == '*')
                    prev *= next
                else
                    prev /= next
                i += getDigits(next)
            } else {
                operations.add(char)
                numbers.add(prev)
                prev = 0
            }
        }
        else {
            prev *= 10; prev += char.toInt() - 48
        }
        i++
    }
    numbers.add(prev)

    i = 0; prev = numbers[i]
    while (i < operations.size) {
        if (operations[i] == '+')
            prev += numbers[i+1]
        else
            prev -= numbers[i+1]
        i++
    }
    return prev
}
fun isOperation(char: Char): Boolean {
    return char == '+' || char == '-' || char == '*' || char == '/'
}
fun hasPriority(char: Char): Boolean {
    return char == '*' || char == '/'
}
fun getNextNumber(txt: String, start: Int): Int {
    var count = 0
    var i = start
    while (i < txt.length && !isOperation(txt[i])) {
        count *= 10
        count += (txt[i]).toInt() - 48
        i++
    }
    return count
}
fun getDigits(nmb: Int): Int {
    var count = 0; var number = nmb
    while (number > 0) {
        count++
        number /= 10
    }
    return count
}