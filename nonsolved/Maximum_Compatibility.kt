package nonsolved//fun nonsolved.main() {
//    val students = arrayOf(intArrayOf(1,1,0), intArrayOf(1,0,1), intArrayOf(0,0,1))
//    val mentors = arrayOf(intArrayOf(1,0,0), intArrayOf(0,0,1), intArrayOf(1,1,0))
//    println(maxCompatibilitySum(students, mentors))
//}
//
//fun maxCompatibilitySum(students: Array<IntArray>, mentors: Array<IntArray>): Int {
//    var count = 0
//    var blockedS = intArrayOf()
//    var blockedM = intArrayOf()
//    val sizeS = students[0].size
//    val sizeB = students.size
//    for (i in 0..(sizeB-1)) {
//        if (blockedS.contains(i)) continue
//        for (j in 0..(sizeB-1)) {
//            if (blockedM.contains(j)) continue
//            if (getDifferenceNumber(students[i], mentors[j]) == 0) {
//                count += sizeS
//                blockedS.
//            }
//        }
//    }
//}
//
//fun getDifferenceNumber(arr1: IntArray, arr2: IntArray): Int {
//    var count = 0
//    val size = arr1.size
//    for (i in 0..(size-1)) {
//        if (arr1[i] == arr2[i]) count++
//    }
//    return size - count
//}