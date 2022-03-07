fun main() {
    println(maxPower("tatt"))
}

fun maxPower(s: String): Int {
    if (s.length == 1) return 1
    var count = 0
    var max = 0
    for (i in 0..(s.length-2)) {
        count++
//        println("$i\t${s[i]}\t${s[i+1]}\t$count\t$max")
        if (s[i] != s[i+1]) {
            if (max < count) {
                max = count
            }
            count = 0
        }
        if (i == s.length - 2 && s[i+1] == s[s.length-1]) {
            count++
        }
//        count++
    }
    return  if (max < count) count
            else max
}