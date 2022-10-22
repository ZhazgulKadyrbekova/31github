fun main() {
    println(buddyStrings("abcaa", "abcbb"))
}

fun buddyStrings(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false

    if (s == goal) {
        val amount = s.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount().values
        return amount.filter { it != 1 }.isNotEmpty()
    }

    var count = 0; var i = 0; var j: Int
    while (i < s.length) {
        j = i + 1
        while (j < s.length) {
            if (s[i] == goal[j] && goal[i] == s[j] && s[i] != s[j])
                count++
            j++
        }
        i++
    }

    return count == 1
}

fun buddyStrings1(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false
    val map1 = s.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    val map2 = goal.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    var count = 0
    for (entry in map1.entries) {
        if (map2[entry.key] != entry.value) count++
    }

    return if (count == 2) true
    else count == 0
//            && amount.any { it != 1 }
}