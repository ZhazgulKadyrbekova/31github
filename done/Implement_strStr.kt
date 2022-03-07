fun main() {
    println(strStr("hello", "ll"))
    println(strStr("aaaaa", "bba"))
    println(strStr("", ""))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}