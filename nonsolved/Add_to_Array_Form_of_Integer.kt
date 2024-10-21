package nonsolved//fun nonsolved.main() {
//    val arr = addToArrayForm(intArrayOf(1,2,0,0), 34)
//    for (i in arr)
//        println(i)
//}
//
//fun addToArrayForm(num: IntArray, k: Int): List<Int> {
//    val arrSize = num.size
//    val numSize = getDigitsNumber(k)
//    var res = 0
//    var j = 0
//    var nmb = k
//    if (arrSize == numSize) {
//        var vume = false
//        for (i in arrSize - 1 downTo 0) {
//            var t = num[i] + nmb % 10
//            nmb /= 10
//            if (vume) {
//                t += 1
//                vume = false
//            }
//            var a = Math.pow(10.0, j.toDouble()).toInt() * t
//            if (t > 9) {
//                res +=
//            }
//        }
//    }
//    for (i in size downTo 0) {
//
//    }
//}
//
//fun getDigitsNumber(num: Int): Int {
//    var k = num
//    var count = 0
//    while (k > 0){
//        k /= 10
//        count++
//    }
//    return count
//}