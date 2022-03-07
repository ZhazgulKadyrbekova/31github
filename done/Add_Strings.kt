fun main() {
    println(addStrings("11", "123"))
    println(addStrings("9133", "0"))
}

fun addStrings(num1: String, num2: String): String {
    val nmb1 = num1.reversed()
    val nmb2 = num2.reversed()
    val res = StringBuilder()
    var vume = false
    var i = 0

    if (nmb1.length == nmb2.length) {
        while (i <= nmb1.length - 1) {
            var t: Int = Character.getNumericValue(nmb1[i]) + Character.getNumericValue(nmb2[i])
//            println("$i\t${nmb1[i]}\t${nmb2[i]}\t$t\t$vume")
            if (vume) {
                vume = false
                t += 1
            }
            if (t > 9) {
                vume = true
                res.append(t%10)
            }
            else
                res.append(t)
            i++
        }
    }
    else if (nmb1.length < nmb2.length) {
        while (i <= nmb1.length - 1) {
            var t: Int = Character.getNumericValue(nmb1[i]) + Character.getNumericValue(nmb2[i])
//            println("$i\t${nmb1[i]}\t${nmb2[i]}\t$t\t$vume")
            if (vume) {
                vume = false
                t += 1
            }
            if (t > 9) {
                vume = true
                res.append(t%10)
            }
            else
                res.append(t)
            i++
        }
        while (i <= nmb2.length - 1) {
            var t: Int = Character.getNumericValue(nmb2[i])
//            println("$i\t${nmb1[i]}\t${nmb2[i]}\t$t\t$vume")
            if (vume) {
                vume = false
                t += 1
            }
            if (t > 9) {
                vume = true
                res.append(t%10)
            }
            else
                res.append(t)
            i++
        }
    }
    else {
        while (i <= nmb2.length - 1) {
            var t: Int = Character.getNumericValue(nmb1[i]) + Character.getNumericValue(nmb2[i])
//            println("$i\t${nmb1[i]}\t${nmb2[i]}\t$t\t$vume")
            if (vume) {
                vume = false
                t += 1
            }
            if (t > 9) {
                vume = true
                res.append(t%10)
            }
            else
                res.append(t)
            i++
        }
        while (i <= nmb1.length - 1) {
            var t: Int = Character.getNumericValue(nmb1[i])
//            println("$i\t${nmb1[i]}\t${nmb2[i]}\t$t\t$vume")
            if (vume) {
                vume = false
                t += 1
            }
            if (t > 9) {
                vume = true
                res.append(t%10)
            }
            else
                res.append(t)
            i++
        }
    }

    if (vume) res.append(1)
    return res.toString().reversed()
}