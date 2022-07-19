fun main() {
    val arr = fizzBuzz(3)
    for (i in arr)
        println(i)
}

fun fizzBuzz(n: Int): List<String> {
    val res = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) res.add("FizzBuzz")
        else if (i % 3 == 0) res.add("Fizz")
        else if (i % 5 == 0) res.add("Buzz")
        else res.add("$i")
    }
    return res
}