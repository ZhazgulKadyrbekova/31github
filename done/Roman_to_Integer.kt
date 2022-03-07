fun main() {
//    println(romanToInt("III"))      //3
//    println(romanToInt("LVIII"))    //58
    println(romanToInt("MCMXCIV"))  //1994
}

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
 */

fun romanToInt(s: String): Int {
    var sum = 0
    var i = 0
    val size = s.length - 1
    while (i <= size) {
//        println("aaaa\t$i")
//        println("$size\t$i\t${s[i]}\t$sum")
        if (s[i] == 'I') {
            if (i != size) {
                if (s[i+1] == 'V') {
                    sum += 4
                    i += 2
                }
                else if (s[i+1] == 'X') {
                    sum += 9
                    i += 2
                }
                else {
                    sum += 1
                    i += 1
                }
            } else {
                sum += 1
                i += 1
            }
        }
        else if (s[i] == 'X') {
            if (i != size) {
                if (s[i+1] == 'L') {
                    sum += 40
                    i += 2
                }
                else if (s[i+1] == 'C') {
                    sum += 90
                    i += 2
                }
                else {
                    sum += 10
                    i += 1
                }
            } else {
                sum += 10
                i += 1
            }
        }
        else if (s[i] == 'C') {
            if (i != size) {
                if (s[i+1] == 'D') {
                    sum += 400
                    i += 2
                }
                else if (s[i+1] == 'M') {
                    sum += 900
                    i += 2
                }
                else {
                    sum += 100
                    i += 1
                }
            } else {
                sum += 100
                i += 1
            }
        }
        else if (s[i] == 'V') {
            sum += 5
            i += 1
        }
        else if (s[i] == 'L') {
            sum += 50
            i += 1
        }
        else if (s[i] == 'D') {
            sum += 500
            i += 1
        }
        else if (s[i] == 'M') {
            sum += 1000
            i += 1
        }
//        println("$size\t$i\t${s[i]}\t$sum")
//        println()
    }
    return sum
}

/*
if (i == size) {
            if (s[i] == 'I') {
                sum += 1
                i += 1
            }
            else if (s[i] == 'X') {
                sum += 10
                i += 1
            }
            else if (s[i] == 'C') {
                sum += 100
                i += 1
            }
        }
        else {
            if (s[i] == 'I') {
                if (s[i+1] == 'V') {
                    sum += 4
                    i += 2
                }
                else if (s[i+1] == 'X') {
                    sum += 9
                    i += 2
                }
                else {
                    sum += 1
                    i += 1
                }
            }
            else if (s[i] == 'X') {
                if (s[i+1] == 'L') {
                    sum += 40
                    i += 2
                }
                else if (s[i+1] == 'C') {
                    sum += 90
                    i += 2
                }
                else {
                    sum += 10
                    i += 1
                }
            }
            else if (s[i] == 'C') {
                if (s[i+1] == 'D') {
                    sum += 400
                    i += 2
                }
                else if (s[i+1] == 'M') {
                    sum += 900
                    i += 2
                }
                else {
                    sum += 100
                    i += 1
                }
            }
        }
 */