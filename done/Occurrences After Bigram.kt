fun main() {
    println(findOcurrences("alice is a good girl she is a good student", "a", "good"))
    println(findOcurrences("we will we will rock you", "we", "will"))
}

fun findOcurrences(text: String, first: String, second: String): Array<String> {
    val arr = text.split(" ")
    val size = arr.size - 1
    val res = mutableListOf<String>()
    var i = 2
    while (i <= size) {
        if (arr[i-2] == first && arr[i-1] == second) {
            res.add(arr[i])
        }
        i++
    }
    return res.toTypedArray()
}