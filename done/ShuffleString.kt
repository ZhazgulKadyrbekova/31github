fun main() {
    println(restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3)))
    println(restoreString("abc", intArrayOf(0,1,2)))
}

fun restoreString(s: String, indices: IntArray): String {
    val size = indices.size
    val charArr = CharArray(size)
    val index = size - 1

    for (i in 0..index)
        charArr[indices[i]] = s[i]

    return String(charArr)
}