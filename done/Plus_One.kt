fun main() {
    val arr = plusOne(intArrayOf(8,9,9,9))
//    val arr = plusOne(intArrayOf(1,2,3,9))
    for (i in arr)
        print("$i\t")
}

fun plusOne(digits: IntArray): IntArray {
    val res: MutableList<Int> = mutableListOf()
    val lastIndex = digits.size-1
    var vume = 0
    for (i in lastIndex downTo 0) {
        if (i == lastIndex)
            digits[i]++
        if (vume != 0) {
//            print(digits[i])
            digits[i]++
//            println("\t" + digits[i])
            vume = 0
        }
        if (digits[i] > 9) {

            res.add(0, digits[i] % 10)
            vume = 1
        }
        else res.add(0, digits[i])
    }
    if (vume == 1) res.add(0, 1)
    return res.toIntArray()
}