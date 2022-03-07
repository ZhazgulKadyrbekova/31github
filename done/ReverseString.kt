fun main() {
    val arr = charArrayOf('h','e','l','l','o', 'o')
    reverseString(arr)
    for (i in arr)
        print("$i\t")
}

fun reverseString(s: CharArray): Unit {
    var temp: Char
    val index = s.size - 1
    val size = if (s.size % 2 == 0) (s.size - 1)/2
    else s.size / 2
    for (i in 0..size) {
        temp = s[i]
        s[i] = s[index-i]
        s[index-i] = temp
    }
}