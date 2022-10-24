fun main() {
    println(minSwaps("]]][[["))
}

fun minSwaps(s: String): Int {
    var swap = 0; var index = s.length
    var balance = 0; var i = 0
    while (i < s.length) {

        if (s[i] == '[') balance++
        else balance--

        index = s.lastIndexOf('[', index)
        if (balance < 0) {
            balance = 1
            swap++
        }
        i++
    }
    return swap
}