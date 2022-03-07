fun main() {
    println(countGoodTriplets(intArrayOf(3,0,1,1,9,7), 7, 2, 3))
    println(countGoodTriplets(intArrayOf(1,1,2,2,3), 0,0,1))
}

fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
    val index = arr.size - 1
    var count = 0

    for (i in 0..index)
        for (j in (i+1)..index)
            for (k in (j+1)..index)
                if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                    count++
    return count
}