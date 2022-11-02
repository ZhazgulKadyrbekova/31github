fun main() {
    val text = readLine()!!.split(" ")
    val n = text[0].toInt()
    val k = text[1].toInt()

    if (k == 1) {
        if (n == 1) {
            println("Yes\n1")
            return
        }
        else {
            println("No")
            return
        }
    }

    if (n * n % k != 0) {
        println("No")
        return
    }

    val res = Array(n) { IntArray(n) }
    var i = 0; var j: Int; var first = 1; var step: Int
    while (i < n) {
        j = 0
        step = first
        while (j < n) {
            if (step > k) step = 1
            res[i][j] = step++
            j++
        }
        i++
        first = if (first + 1 > k) 1 else first + 1
    }

    i = 0
    while (i < n) {
        j = 0
        while (j < n) {
            print("${res[i][j]} ")
            j++
        }
        println()
        i++
    }
}