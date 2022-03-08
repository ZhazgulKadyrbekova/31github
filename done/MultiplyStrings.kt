fun main() {
//    println(multiply("123", "456"))
    println(multiply("9", "9"))
    println(multiply("2", "3"))
    println(multiply("2456", "0"))
//    println(multiply("123456789", "987654321"))
}

fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0") return "0"
    val iSize = num2.length - 1
    val jSize = num1.length - 1
    val list = mutableListOf<List<Int>>()
    for (i in iSize downTo 0) {
        val sec = num2[i].toInt() - 48
        val temp = mutableListOf<Int>()
        for (k in 0 until iSize - i) temp.add(0)
        var vume = 0
        for (j in jSize downTo 0) {
//            println("$i\t${num2[i]}\t$j\t${num1[j]}")
            val fir = num1[j].toInt() - 48
            val multiply = fir * sec + vume
//            temp += multiply % 10 * getPow(jSize - j)
            temp.add(multiply % 10) //* getPow(jSize - j)
            vume = multiply / 10
//            println("$multiply\t$temp")
        }
        if (vume != 0) {
            temp.add(vume)
            for (k in iSize - i until iSize) temp.add(0)
        }
        else
            for (k in iSize - i until iSize+1) temp.add(0)

        list.add(temp)
//        res += temp * getPow(iSize - i)
//        println("$temp\t$res")
//        println()
    }

//    println(list)
    for (i in list)
        println(i)
    return getSum(list)
}

fun getSum(list: List<List<Int>>): String {
    val rows = list.size                //строки
    val columns = list[rows-1].size     //столбцы

    val stringBuilder = StringBuilder()
    var sum = 0
    var vume = 0
    for (i in 0 until columns) {
        for (j in 0 until rows) {
            print("$j\t$i\t")
//            if (list[j].size < i)
                sum += list[j][i]
            println("${list[j][i]}\t$sum")
        }
        sum += vume
        stringBuilder.insert(0, sum % 10)
        vume = sum / 10
        sum = 0
    }
    if (vume != 0)
        stringBuilder.insert(0, vume)
    return stringBuilder.toString().removePrefix("0")
}