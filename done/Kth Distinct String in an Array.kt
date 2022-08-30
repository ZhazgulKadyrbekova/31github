fun main() {
    println(kthDistinct(arrayOf("d","b","c","b","c","a"), 2))
}

fun kthDistinct(arr: Array<String>, k: Int): String {
    val keys = arr.groupingBy{ it }.eachCount().filter{ it.value == 1 }.keys.toMutableList()
    println(keys)
    return if (keys.size < k) ""
    else keys[k-1]
}