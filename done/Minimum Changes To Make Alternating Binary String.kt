fun main() {
    println(minOperations("0100"))
    println(minOperations("1111"))
}

private fun minOperations(s: String): Int {
    var count1 = 0; var count2 = 0
    var i = 0; val size = s.length - 1
    while (i < size) {
        if (s[i] != '1') count1++
        if (s[i+1] != '0') count1++

        if (s[i] != '0') count2++
        if (s[i+1] != '1') count2++

        i += 2
    }
    if (i == size) {
        if (s[i] != '1') count1++
        if (s[i] != '0') count2++
    }

    return if (count1 < count2) count1 else count2
}