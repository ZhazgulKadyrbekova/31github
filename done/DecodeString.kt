import java.util.*

fun main() {
//    println(decodeString("2[k]3[ab]"))
//    println(decodeString("2[abc]ef2[c]"))
//    println(decodeString("2[a3[c]2[y2[k]]]"))
    println(decodeString("10[le]"))
}

fun decodeString(s: String): String {
    val stack = Stack<String>()

    var txt = ""
    var number = ""
    for (i in s) {
        println("$i\t${txt}\t$number\t${stack}")
        if (i == '[') {
            stack.push(txt)
            stack.push(number)
            txt = ""
            number = ""
        }
        else if (i == ']') {
            val prevNmb = stack.pop()
            val prevTxt = stack.pop()
            txt = prevTxt + repeatTxt(txt,prevNmb)
        }
        else if (i.isDigit()) {
            number += i
        }
        else {
            txt += i
        }
        println("$i\t${txt}\t$number\t${stack}")
        println()
    }
    return txt
}
fun repeatTxt(t: String, n: String): String {
    var nmb = 0
    for (i in n) {
        nmb = nmb * 10 + i.toInt() - 48
    }
    var txt = ""
    for (i in 0..(nmb-1)) {
        txt += t
    }
    return txt
}
