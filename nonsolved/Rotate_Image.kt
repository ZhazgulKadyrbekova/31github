package nonsolved

fun main() {
//    val arr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    val arr = arrayOf(intArrayOf(5,1,9,11), intArrayOf(2,4,8,10), intArrayOf(13,3,6,7), intArrayOf(15,14,12,16))
//    val arr = arrayOf(intArrayOf(4,8), intArrayOf(3,6))
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
    println()
    rotate(arr)
    println()
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun rotate(matrix: Array<IntArray>) {
    val n = matrix[0].size
    var lastIndex = n - 1
    var firstIndex = 0
    var size = n - 2
    while (lastIndex > firstIndex) {
        println("$lastIndex\t$firstIndex\t$size\t$n")

        val temp = IntArray(size+1)

        //temp
        for (i in firstIndex..size)
            temp[i] = matrix[firstIndex][i]

        //3
        for (i in firstIndex..size)
            matrix[firstIndex][i] = matrix[lastIndex - i][firstIndex]

        //6
        for (i in firstIndex..size)
            matrix[lastIndex - i][firstIndex] = matrix[lastIndex][lastIndex - i]

        //8
        for (i in firstIndex..size)
            matrix[lastIndex][lastIndex - i] = matrix[i][lastIndex]

        //4 - temp
        for (i in firstIndex..size)
            matrix[i][lastIndex] = temp[i]

        lastIndex -= 1
        firstIndex += 1
        size -= 1
    }
}