fun main() {
    println(magicalString(6))
}

fun magicalString(n: Int): Int {
    if (n <= 3) return 1
    var s = "122"
    var i = 2; var j = 2
    while (j < n) {
        if (s[i] == '1'){
            if (s[j] == '1') {
                s += "2"
            } else {
                s += "1"
            }
            j++
        } else {
            if (s[j] == '1') {
                s += "22"
            } else {
                s += "11"
            }
            j+=2
        }
        i++
    }
    var ones = 0; i = 0
    while (i < n) {
        if (s[i] == '1') ones++
        i++
    }
    return ones
}