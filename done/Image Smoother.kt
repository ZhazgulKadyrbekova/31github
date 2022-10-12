fun main() {
    val rectangle = arrayOf(
        intArrayOf(1, 2, 1),
        intArrayOf(4, 3, 4),
        intArrayOf(3, 2, 1),
        intArrayOf(1, 1, 1)
    )
    val arr = imageSmoother(rectangle)
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val n = img.size; val m = img[0].size
    val res = Array(n) { IntArray(m) }
    var i = 0; var j: Int
    
    while (i < n) {
        j = 0
        while (j < m) {

            var top = true; var bottom = true; var left = true; var right = true
            if (i - 1 < 0) left = false
            if (i + 1 >= n) right = false
            if (j - 1 < 0) top = false
            if (j + 1 >= m) bottom = false

            var count = 1
            var sum = img[i][j]
            if (top) {
                sum += img[i][j-1]
                count++
            }
            if (bottom) {
                sum += img[i][j+1]
                count++
            }
            if (left) {
                sum += img[i-1][j]
                count++
            }
            if (right) {
                sum += img[i+1][j]
                count++
            }
            if (top && left) {
                sum += img[i-1][j-1]
                count++
            }
            if (bottom && right) {
                sum += img[i+1][j+1]
                count++
            }
            if (left && bottom) {
                sum += img[i-1][j+1]
                count++
            }
            if (right && top) {
                sum += img[i+1][j-1]
                count++
            }
            sum /= count
            res[i][j] = sum

            j++
        }
        i++
    }
    return res
}
