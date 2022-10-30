fun main() {
    println(numberOfSubstrings("abcabc"))
}

fun numberOfSubstrings(s: String): Int {
    val size = s.length; var count = 0; var i = 0
    while (i < size) {
        var max = 0
        if (s.indexOf('a', i) != -1 && s.indexOf('b', i) != -1 && s.indexOf('c', i) != -1) {
            if (s.indexOf('a', i) > max) max = s.indexOf('a', i)
            if (s.indexOf('b', i) > max) max = s.indexOf('b', i)
            if (s.indexOf('c', i) > max) max = s.indexOf('c', i)
            count += size - max
        }
        i++
    }
    return count
}