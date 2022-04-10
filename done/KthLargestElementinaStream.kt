package done

fun main() {
    val a = KthLargest(2, intArrayOf(0))
    a.printArr()
    println(a.add(-1))
    a.printArr()
    println(a.add(1))
    a.printArr()
    println(a.add(-2))
    a.printArr()
    println(a.add(-4))
    a.printArr()
    println(a.add(3))
    a.printArr()
}
class KthLargest(k: Int, nums: IntArray) {

    private var arr = nums.sortedDescending().toMutableList()
    private var size = nums.size
    private val order = k - 1

    fun add(`val`: Int): Int {
        var flag = false
        println("val\t${`val`}")
        for (i in size - 1 downTo 0) {
            if (arr[i] > `val`) {
                arr.add(i+1, `val`)
                size++
                flag = true
                break
            }
        }
        if (!flag) {
            arr.add(0, `val`)
            size++
        }
        return ithElem()
    }

    private fun ithElem() : Int = if (order >= size) arr[size-1] else arr[order]

    fun printArr() {
        for (i in arr)
            print("$i\t")
        println()
    }
}