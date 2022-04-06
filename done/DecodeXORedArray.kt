fun main() {
    val arr = decode(intArrayOf(1,2,3),1)
    for (i in arr)
        print("$i\t")
    println()
}

fun decode(encoded: IntArray, first: Int): IntArray {
    var prev = first
    val size = encoded.size
    val arr = IntArray(size + 1)
    arr[0] = first
    for (i in 1..size) {
//        print("$i\t${encoded[i-1]}\t$prev\t")
        arr[i] = encoded[i-1] xor prev
//        println(arr[i])
        prev = arr[i]
    }
    return arr
}

/*
1,0,2,1

0001
0000
xor
0001 -> 1

0000
0010
xor
0010 -> 2

0010
0001
xor
0011 -> 3
 */