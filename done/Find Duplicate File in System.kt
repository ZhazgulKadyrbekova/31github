fun main() {
    val arr = findDuplicate(arrayOf("root/a 1.txt(abcd) 2.txt(efsfgh)", "root/c 3.txt(abdfcd)", "root/c/d 4.txt(efggdfh)"))
    for (i in arr)
        println(i)
}

fun findDuplicate(paths: Array<String>): List<List<String>> {
    val map = hashMapOf<String, MutableList<String>>()
    for (folder in paths) {
        val arr = folder.split(" ")
        val dir = arr[0]; var i = 1
        while (i < arr.size) {
            val sign = arr[i].indexOf('(')
            val name = "$dir/${arr[i].substring(0,sign)}"
            val content = arr[i].substring(sign, arr[i].length - 1)
            if (map[content] == null)
                map[content] = mutableListOf(name)
            else map[content]!!.add(name)
            i++
        }
    }
//    println(map)
    return map.values.toList().filter { it.size != 1 }
}