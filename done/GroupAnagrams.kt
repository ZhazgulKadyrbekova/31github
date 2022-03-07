fun main() {
    val arr = groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
    println(arr)
//    for (i in arr) {
//        for (j in i)
//            println(j)
//        println()
//    }
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = hashMapOf<String, MutableList<String>>()
    val index = strs.size - 1
    for (i in 0..index) {
        val key1: CharArray = strs[i].toCharArray()
        key1.sort()
        val key = key1.joinToString("")
//        println("key: $key\t\tstr[i]: ${strs[i]}")
        if (map[key] == null) {
            map[key] = mutableListOf(strs[i])
        }
        else {
            map[key]!!.add(strs[i])
        }
    }
    val res = mutableListOf<List<String>>()
    for (i in map.values) {
        val arr: List<String> = i
//        println("arr: $arr")
        res.add(arr)
    }
    return res
}