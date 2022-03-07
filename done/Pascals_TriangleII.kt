fun main() {
    println(getRow(5))
}

fun getRow(rowIndex: Int): List<Int> {
    var temp: MutableList<Int> = mutableListOf(1)
    for (i in 1..(rowIndex)) {
//        println("aaaaa\t$i\t$temp")
        temp = nextArr2(temp)
    }
    return temp
}

fun nextArr2(list: MutableList<Int>): MutableList<Int> {
//    println("bbbb\t$list")
    val size = list.size
    if (size == 1)
        return mutableListOf(1,1)
    val res = mutableListOf<Int>()
    val lastIndex = (size)/2
    val midIndex =  if (size%2 == 0) size/2 - 1
                    else size/2
    for (i in 0..lastIndex) {
        if (i == 0) res.add(1)
        else res.add(list[i-1] + list[i])
    }
    for (i in midIndex downTo 0)
        res.add(res[i])
//    println("ccc\t\t$res")
    return res
}