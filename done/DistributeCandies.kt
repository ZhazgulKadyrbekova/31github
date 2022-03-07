fun main() {
    println(distributeCandies(intArrayOf(1,1,2,2,3,3)))
    println(distributeCandies(intArrayOf(1,1,2,3)))
    println(distributeCandies(intArrayOf(6,6,6,6)))
}

fun distributeCandies(candyType: IntArray): Int {
    val set = candyType.toSet()
    println(set)
    val n = candyType.size / 2
    val size = set.size
    println("$n\t$size")
    return  if (size >= n) n
            else size
}