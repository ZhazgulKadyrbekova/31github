fun main() {
    println(findLUSlength("aba", "cdc"))
}

fun findLUSlength(a: String, b: String): Int {
    if (a == b) return -1
    if (a.length == b.length) return a.length
    return if (a.length > b.length) a.length else b.length

    val aMap = a.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    val bMap = b.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()

    var aCount = 0
    var bCount = 0
    for (key in aMap.keys) {
        if (!bMap.keys.contains(key)) aCount += aMap[key]!!
        else aCount += Math.abs(aMap[key]!! - bMap[key]!!)
    }
    for (key in bMap.keys) {
        if (!aMap.keys.contains(key)) bCount += bMap[key]!!
        else bCount += Math.abs(aMap[key]!! - bMap[key]!!)
    }
    return if (aCount > bCount) aCount else bCount
}