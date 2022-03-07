fun main() {
//    val arr = flipAndInvertImage(arrayOf(intArrayOf(1,1,0), intArrayOf(1,0,1), intArrayOf(0,0,0)))
    val arr = flipAndInvertImage(arrayOf(intArrayOf(1,1,0,0), intArrayOf(1,0,0,1), intArrayOf(0,1,1,1), intArrayOf(1,0,1,0)))
//    [1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val size = image.size
    val res = Array(size) { IntArray(size) }

    for (i in 0 until size) {
        val imageRow = image[i]
        val array = IntArray(size)
        for (j in (size-1) downTo 0) {
            array[size-1-j] = if (imageRow[j] == 0) 1 else 0
        }
        res[i] = array
    }
    return res
}