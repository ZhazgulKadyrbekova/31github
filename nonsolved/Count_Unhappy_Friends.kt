package nonsolved

fun main() {
//    val n = 4
//    val preferences = arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,0), intArrayOf(3,1,0), intArrayOf(1,2,0))
//    val pairs = arrayOf(intArrayOf(0,1), intArrayOf(2,3))

//    val n = 2
//    val preferences = arrayOf(intArrayOf(1), intArrayOf(0))
//    val pairs = arrayOf(intArrayOf(1, 0))

    val n = 4
    val preferences = arrayOf(intArrayOf(1,3,2), intArrayOf(2,3,0), intArrayOf(1,0,3), intArrayOf(1,0,2))
    val pairs = arrayOf(intArrayOf(2,1), intArrayOf(3,0))


    println(unhappyFriends(n, preferences, pairs))
}
//n = 4, preferences = [[1, 2, 3], [3, 2, 0], [3, 1, 0], [1, 2, 0]], pairs = [[0, 1], [2, 3]]
//2

//n = 4, preferences = [[1, 3, 2], [2, 3, 0], [1, 3, 0], [0, 2, 1]], pairs = [[1, 3], [0, 2]]
//Output: 4

//4
//[[1,3,2],[2,3,0],[1,0,3],[1,0,2]]
//[[2,1],[3,0]]
//0
fun unhappyFriends(n: Int, preferences: Array<IntArray>, pairs: Array<IntArray>): Int {
    val pairSize = n/2
    var count = 0
    for (i in 0..(pairSize-1)) {
        for (j in 0..1) {
            println("$i\t$j\t$count")
            val index = pairs[i][j]
            val pairIndex = if (j == 0) 1
                            else 0
            val antiPairIndex = j
            val value = pairs[i][pairIndex]

            if (preferences[index][0] == value) continue
            for (k in 0..(pairSize-1)) {
                if (k==i) continue
                if (preferences[index][0] == pairs[k][antiPairIndex]) continue

                count++
                println("$i\t$j\t$k\t$count")
                println()
            }
        }
    }
    return count
}