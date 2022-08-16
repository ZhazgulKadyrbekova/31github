fun main() {
    println(numJewelsInStones("aA","aAAbbbb"))
}

fun numJewelsInStones(jewels: String, stones: String): Int {
    var count = 0
    for (i in stones) {
        if (jewels.contains(i)) count++
    }
    return count
}