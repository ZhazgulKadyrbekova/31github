fun main() {
//    println(addBinary("11", "1"))
//    println(addBinary("1010", "1011"))
    println(addBinary("1", "111"))
}

fun addBinary(a: String, b: String): String {
    val n = a.reversed()
    val m = b.reversed()
    val min = Math.min(a.length, b.length)
    val max = Math.max(a.length, b.length)
    var vume = false

    val stringBuilder = StringBuilder()
    var k = 0
    while (k < min) {
        print("$k\t${n[k]}\t${m[k]}\t$vume\t")
        if (n[k] == '1' && m[k] == '1' && vume) {
            stringBuilder.append('1')
            vume = true
        }
        else if (n[k] == '1' && m[k] == '1') {
            stringBuilder.append('0')
            vume = true
        }
        else if ((n[k] == '1' || m[k] == '1') && vume) {
            stringBuilder.append('0')
            vume = true
        }
        else if (n[k] == '1' || m[k] == '1') {
            stringBuilder.append('1')
            vume = false
        }
        else if (vume) {
            stringBuilder.append('1')
            vume = false
        }
        else {
            stringBuilder.append('0')
            vume = false
        }
        k++
        println(stringBuilder)
    }
    while (k < max) {
        println()
//        print("$k\t${n[k]}\t${m[k]}\t$vume\t")
        if (n.length > k) {
            if (n[k] == '1' && vume) {
                stringBuilder.append('0')
                vume = true
            }
            else if (n[k] == '1') {
                stringBuilder.append('1')
                vume = false
            }
            else if (vume) {
                stringBuilder.append('1')
                vume = false
            }
            else {
                stringBuilder.append('0')
                vume = false
            }
        }
        else {
            if (m[k] == '1' && vume) {
                stringBuilder.append('0')
                vume = true
            }
            else if (m[k] == '1') {
                stringBuilder.append('1')
                vume = false
            }
            else if (vume) {
                stringBuilder.append('1')
                vume = false
            }
            else {
                stringBuilder.append('0')
                vume = false
            }
        }
        k++
        println(stringBuilder)
    }
    if (vume) stringBuilder.append('1')
    return stringBuilder.toString().reversed()
}