fun main() {
    println(squareIsWhite("a1"))
    println(squareIsWhite("h3"))
    println(squareIsWhite("c7"))
}

fun squareIsWhite(coordinates: String): Boolean {
    val sum = coordinates[0].toInt() + coordinates[1].toInt()
    return sum % 2 == 1
}