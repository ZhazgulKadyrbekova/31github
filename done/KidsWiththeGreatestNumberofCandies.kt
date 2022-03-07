fun main() {
    val arr = kidsWithCandies(intArrayOf(12,1,12), 10)
    for (i in arr)
        println(i)
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    var maxInArr = 0
    val arr = mutableListOf<Boolean>()

    for (i in candies)
        if (i > maxInArr)
            maxInArr = i

    for (i in candies)
        if (i + extraCandies >= maxInArr)
            arr.add(true)
        else
            arr.add(false)

    return arr
}