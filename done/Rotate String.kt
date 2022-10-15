fun main() {
    println(rotateString("abcdeabcde", "abcde"))
}

fun rotateString(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false
    val size = s.length; var i = 0; var j = 0; var finished = true
    while (i < size) {
        j = 0; finished = true
        while (j < goal.length) {
            val index = (i + j) % size
            if (s[index] != goal[j]) {
                finished = false
                break
            }
            j++
        }
        if (finished) return true
        i++
    }
    return false
}