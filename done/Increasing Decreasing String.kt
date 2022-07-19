fun main() {
    println(sortString("aaaabbbbcccc"))
//    println(sortString("rat"))
}

fun sortString(s: String): String {
    val arr = s.toCharArray().map { it.toInt() }.sorted().toMutableList()
    val res = mutableListOf<Char>()
    val size = arr.size
    var repeat = size
    while (repeat > 0) {
        var i = 0
        var j = size-1
        var prev = 0
        var next = 0
        while (i < size) {
            if (prev != arr[i] && arr[i] != 0) {
                res.add(arr[i].toChar())
                prev = arr[i]
                arr[i] = 0
                repeat--
            }
            i++
        }
        while (j >= 0) {
            if (next != arr[j] && arr[j] != 0) {
                res.add(arr[j].toChar())
                next = arr[j]
                arr[j] = 0
                repeat--
            }
            j--
        }
    }
    return res.joinToString("")
}