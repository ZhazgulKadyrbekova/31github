fun main() {
    val arr = cellsInRange("K1:L2")
    for (i in arr) {
        println(i)
    }
}

fun cellsInRange(s: String): List<String> {
    val res = mutableListOf<String>()
    val arr = s.split(":")
    for (char in arr[0][0]..arr[1][0]) {
        for (nmb in arr[0][1]..arr[1][1]) {
            res.add("$char$nmb")
        }
    }
    return res
}