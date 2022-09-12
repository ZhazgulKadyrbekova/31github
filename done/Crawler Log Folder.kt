fun main() {
    println(minOperations(arrayOf("d1/","d2/","../","d21/","./")))
}

fun minOperations(logs: Array<String>): Int {
    var count = 0
    for (step in logs) {
        if (step == "../") {
            if (count != 0)
                count--
        }
        else if (step == "./") {
            continue
        }
        else {
            count++
        }
    }
    return count
}