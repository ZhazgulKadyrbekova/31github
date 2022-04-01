fun main() {
    println(reverseStr("abcdefg", 8))
    println(reverseStr("abcdefg", 2))
    println(reverseStr("abcd", 4))
    println(reverseStr("abcd", 2))
}

fun reverseStr(s: String, k: Int): String {
    val arr = s.toCharArray()
    val size = arr.size
    var j = 0
    for (i in 0..size step k) {
        println("$j\t$i\t${i+k}\t$size")

        if (j++ % 2 != 0) continue

        if (i == size) break
        if (i + k > size)
            reverseString(arr,i,size)
        else
            reverseString(arr,i,i+k)
    }
    return arr.joinToString("")
}

fun reverseString(arr: CharArray, start: Int, end: Int) {
    val size = end - start - 1
    val half = size/2
    for (i in 0..half) {
        val temp = arr[start+i]
        arr[start+i] = arr[end-1-i]
        arr[end-1-i] = temp
    }
}