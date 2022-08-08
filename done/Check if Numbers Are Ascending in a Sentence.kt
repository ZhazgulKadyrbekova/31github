fun main() {
    println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"))
    println(areNumbersAscending("hello world 5 x 5"))
    println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"))
}

fun areNumbersAscending(s: String): Boolean {
    val arr = s.split(" ")
    var prev = 0
    for (i in arr) {
        val intVal = i.toIntOrNull()
//        println("intVal: $intVal\tprev: $prev\t")
        if (intVal != null) {
            if (prev < intVal) prev = intVal
            else return false
        }
    }
    return true
}