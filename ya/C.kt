import java.util.*

val map: HashMap<String, Int> = hashMapOf()
val finished = MutableList(500) { false }
var k = 0

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()
//    println(n)
    val res = MutableList(n) { "" } // mutableListOf<String>()
    while (k < n) {
        val text = scanner.nextLine().split(" ")
        println(text)
        if (text[0] == "1") {
//            println(text[1])
//            println(k)
//            println(res[k])
            res[k] = text[1]
            finished[k] = true
            val key = "C${k+1}"
            map[key] = text[1].toInt()
        }
        else {
            res[k] = getSum(text[1])
        }
        k++
    }
    println("map:\t$map")
    k = 0
    while (k < n) {
        if (finished[k]) {
            k++
            continue
        }
        println("res[k]:\t${res[k]}")
        res[k] = getSum(res[k])
        k++
    }
    println("map:\t$map")
//    println("finished:\t$finished")
    println(res)
}

fun getSum(text: String): String {
//    C1+C1*C2+C2
    val sb = StringBuilder()
    var i = 0; var start = 0
    while (i < text.length) {
        if (text[i] == '+' || text[i] == '-' || text[i] == '*') {
            val key = text.substring(start, i)
            println("key:\t$key")
            if (map[key] == null) {
                finished[k] = false
                return text
            } else {
                val value = map[key]
                sb.append(value).append(text[i])
            }
            start = i + 1
        }
        i++
    }
    println("text\t$text\tstart:\t$start\ti:\t$i")
    var key = text.substring(start, i)
    println("key:\t$key")
    if (map[key] == null) {
        finished[k] = false
        return text
    } else {
        val value = map[key]
        sb.append(value)
    }

    println("sb:\t${sb}")
    val res = solve(sb.toString())
    finished[k] = true
    key = "C${k+1}"
    map[key] = res.toInt()
    return res
}
fun solve(text1: String): String {
    println("solve:\t$text1")
    var text = text1
    var index: Int
    while (text.indexOf('*') != -1) {
        index = text.indexOf('*')
        text = operation(text, index, Operation.MULTIPLY)
    }
    while (text.indexOf('+') != -1) {
        index = text.indexOf('+')
        text = operation(text, index, Operation.PLUS)
    }
    while (text.indexOf('-') != -1) {
        index = text.indexOf('-')
        text = operation(text, index, Operation.MINUS)
    }
    return text
}
fun operation(text: String, index: Int, operation: Operation): String {
    println("operation:\t$text\t$index\t$operation")
    var start = index - 1
    while (start != 0 && !isSign(text[start])) {
        start -= 1
//        println(start)
    }
    var end = index + 1
    while (end != text.length && !isSign(text[end])) {
        end += 1
    }
    println("$start\t${text[start]}\t\t$index\t${text[index]}\t\t$end")
    val fir = text.substring(start, index).toInt()
    val sec = text.substring(index + 1, end).toInt()
    val res = when (operation) {
        Operation.MULTIPLY -> fir * sec
        Operation.MINUS -> fir - sec
        Operation.PLUS -> fir + sec
    }
    println("fir:\t$fir\t\tsec:\t$sec\t\tres:\t$res")
    if (start != 0) start += 1
    return text.replace(text.substring(start, end), res.toString())
}
fun isSign(char: Char): Boolean {
    return char == '+' || char == '-' || char == '*'
}
enum class Operation {
    PLUS,
    MINUS,
    MULTIPLY
}