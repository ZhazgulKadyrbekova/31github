fun main() {
    val arr: Array<String> = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(arr))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) return strs[0]
    val size = strs.size - 1
    var temp = getCommon(strs[0], strs[1])
    for (i in 2..size) {
//        println("$i\t${strs[i]}")
        temp = getCommon(temp, strs[i])
    }
    return temp
}

fun getCommon(str1: String, str2: String): String {
    val size =  if (str1.length < str2.length) str1.length - 1
                else str2.length - 1
    val stringBuilder = StringBuilder()
    for (i in 0..size) {
        if (str1[i] == str2[i]) stringBuilder.append(str1[i])
        else return stringBuilder.toString()
    }
    return stringBuilder.toString()
}