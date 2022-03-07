fun main() {
//    val arr = twoSum(intArrayOf(2,7,11,15), 9)
//    val arr = twoSum(intArrayOf(2,3,4), 6)
    val arr = twoSum(intArrayOf(-1, 0), -1)
    println("${arr[0]}\t${arr[1]}")
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val size = numbers.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (numbers[i] + numbers[j] == target)
                return intArrayOf(i + 1, j + 1)
        }
    }
    return intArrayOf()
}