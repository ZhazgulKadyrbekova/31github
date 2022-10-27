fun main() {
    println(minimizeResult("247+38"))
}

fun minimizeResult(expression: String): String {
    val size = expression.length
    var plus = 0
    while (plus < size && expression[plus] != '+') plus++; plus++

    var res = ""
    var ans = 1000000000

    var m = 0; var n: Int
    while (m < plus - 1) {
        n = plus
        while (n < size) {

            val sb = StringBuilder(expression)
            sb.insert(n + 1, ')')
            sb.insert(m, '(')

            var a = 0; var b = 0; var c = 0; var d = 0
            var i = 0
            while (sb[i] != '(') {
                a = a * 10 + (sb[i] - '0')
                i++
            }
            i++

            while (sb[i] != '+') {
                b = b * 10 + (sb[i] - '0')
                i++
            }
            i++

            while (sb[i] != ')') {
                c = c * 10 + (sb[i] - '0')
                i++
            }
            i++

            while (i < sb.length) {
                d = d * 10 + (sb[i] - '0')
                i++
            }

            if (a == 0) a = 1
            if (d == 0) d = 1

            val temp = a * (b + c) * d

            if (temp < ans) {
                ans = temp
                res = sb.toString()
            }
            n++
        }
        m++
    }

    return res
}