package done

fun main() {
    val rectangle = arrayOf(
        intArrayOf(1,2,1),
        intArrayOf(4,3,4),
        intArrayOf(3,2,1),
        intArrayOf(1,1,1)
    )
    val obj = SubrectangleQueries(rectangle)
    obj.updateSubrectangle(3,0,3,2,5)
    println(obj.getValue(2,0))
    println(obj.getValue(3,0))
}

class SubrectangleQueries(private val rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        var i = row1; var j: Int
        while (i <= row2) {
            j = col1
            while (j <= col2) {
                rectangle[i][j] = newValue
                j++
            }
            i++
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }

}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * var obj = SubrectangleQueries(rectangle)
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
 * var param_2 = obj.getValue(row,col)
 */