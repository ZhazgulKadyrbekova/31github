fun main() {
    println(canConstruct("a", "b"))
    println(canConstruct("aa", "ab"))
    println(canConstruct("aa", "aab"))
    println(canConstruct("aab", "baa"))
    println(canConstruct("aabb", "baba"))
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val size = magazine.length - 1
    val ransomMap = mutableMapOf<Char, Int>()
    val magazineMap = mutableMapOf<Char, Int>()
    for (i in 0..size) {
        if (i < ransomNote.length) {
            val key = ransomNote[i]
            val value = ransomMap[key]
            if (value == null) ransomMap[key] = 1
            else ransomMap[key] = value + 1
        }
        if (i < magazine.length) {
            val key: Char = magazine[i]
            val value = magazineMap[key]
            if (value == null) magazineMap[key] = 1
            else magazineMap[key] = value + 1
        }
    }
    for (i in 0..size) {
        if (i < ransomNote.length) {
            val key = ransomNote[i]
            val ransomValue = ransomMap[key] ?: 0
            val magazineValue = magazineMap[key] ?: 0
            if (magazineValue < ransomValue) return false
        }
        val key = magazine[i]
        val ransomValue = ransomMap[key] ?: 0
        val magazineValue = magazineMap[key] ?: 0
//        println("$i\t$ransomValue\t$magazineValue")
        if (magazineValue < ransomValue) return false
    }
    return true
}