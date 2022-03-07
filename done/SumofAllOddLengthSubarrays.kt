fun main() {
    println(sumOddLengthSubarrays(intArrayOf(1,4,2,5,3)))
}

fun sumOddLengthSubarrays(arr: IntArray): Int {
    val size = arr.size
    val prefixSum = IntArray(size+1)
    var prev = 0
    prefixSum[0] = 0
    for (i in 1..size) {
        prev += arr[i-1]
        prefixSum[i] = prev
    }
    var sum = prefixSum[size]

    var gap =   if (size % 2 == 1) size
                else size - 1

    while (gap >= 3) {
        for (i in gap..size)
            sum += prefixSum[i] - prefixSum[i-gap]
        gap -= 2
    }

    return sum
}