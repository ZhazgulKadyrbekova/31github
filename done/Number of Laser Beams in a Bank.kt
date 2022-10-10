fun main() {
    val rectangle = arrayOf("000000","011001","010100","001000")
    println(numberOfBeams(rectangle))
}

fun numberOfBeams(bank: Array<String>): Int {
    val tmp = IntArray(bank.size)
    for (i in bank.indices) {
        val qty = bank[i].toCharArray().filter { it == '1' }.size
        tmp[i] = qty
    }
    println("tmp:")
    for (i in tmp)
        print("$i\t")
    println()

    var i = 1; var res = 0; var prev = tmp[0]
    while (i < tmp.size) {
        if (tmp[i] != 0) {
            res += prev * tmp[i]
            prev = tmp[i]
        }
        i++
    }

    return res
}

fun numberOfBeams1(bank: Array<String>): Int {
    var res = 1; var hasOne: Boolean; var rows = 0; var i = 0; var j: Int
    while (i < bank.size) {
        var ones = 0; j = 0; hasOne = false
        while (j < bank[0].length) {
            println("$res\t$rows\t$ones\t$hasOne")
            if (bank[i][j] == '1') {
                ones++; hasOne = true
            }
            j++
        }
        if (hasOne) rows++
        if (ones != 0) res *= ones;
        i++
    }
    return if (rows == 1) 0
    else res
}