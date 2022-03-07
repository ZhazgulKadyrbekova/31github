fun main() {
    println(countSegments("Hello World"))
    println(countSegments("   fly me   to   the moon  "))
    println(countSegments("luffy is still joyboy"))
    println(countSegments("Hello, my name is John"))
}

fun countSegments(s: String): Int {
    return s.split(" ").map {
        it.trim()
    }.filter {
        it != ""
    } .size
}