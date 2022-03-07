fun main() {
    println(
        countMatches(
            listOf(
                listOf("phone","blue","pixel"),
                listOf("computer","silver","lenovo"),
                listOf("phone","gold","iphone")
            ),
            "color",
            "silver"
        )
    )
    println(
        countMatches(
            listOf(
                listOf("phone","blue","pixel"),
                listOf("computer","silver","phone"),
                listOf("phone","gold","iphone")
            ),
            "type",
            "phone"
        )
    )
}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0
    for (i in items) {
        when (ruleKey) {
            "type" -> if (i[0] == ruleValue) count++
            "color" -> if (i[1] == ruleValue) count++
            "name" -> if (i[2] == ruleValue) count++
        }
    }
    return count
}