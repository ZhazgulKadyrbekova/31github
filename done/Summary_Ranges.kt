fun main() {
    val arr = intArrayOf(0,1,3,4,5,6)
    println(summaryRanges(arr))
}
fun summaryRanges(nums: IntArray): List<String> {
    val list = mutableListOf<String>()
    if (nums.isEmpty()) return list
    val size = nums.size - 2
    var isFirst = true
    var txt = ""
    for (i in 0..size) {
//        println("$i\t${nums[i]}\t$isFirst\t$txt")
        if (nums[i+1] - nums[i] == 1 && isFirst) {
            txt += nums[i].toString()
            isFirst = false
        } else if (nums[i+1] - nums[i] == 1 && !isFirst && !txt.endsWith("->")) {
            txt += "->"
        } else if (nums[i+1] - nums[i] != 1) {
            if (txt.isEmpty())
                txt += nums[i].toString()
            else if (!txt.endsWith("->"))
                txt += "->" + nums[i].toString()
            else
                txt += nums[i].toString()
            list.add(txt)
            txt = ""
            isFirst = true
        }
//        println("$i\t${nums[i]}\t$isFirst\t$txt")
//        println()
    }

    if (txt.isEmpty()) {
        list.add(nums[size+1].toString())
    } else {
//        println("else")
        if (!txt.contains("->"))
            txt += "->" + nums[size+1].toString()
        else
            txt += nums[size+1].toString()
        list.add(txt)
    }
    return list
}