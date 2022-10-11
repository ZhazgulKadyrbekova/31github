fun main() {
    println(isIsomorphic("egg", "add"))
    println(isIsomorphic("foo", "bar"))
    println(isIsomorphic("paper", "title"))
    println(isIsomorphic("papee", "title"))
    println(isIsomorphic("badc", "baqa"))
}

fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()
    for (i in s.indices) {
        if (map.keys.contains(s[i]) && map[s[i]] != t[i]) return false
        if (map.values.contains(t[i]) && map[s[i]] != t[i]) return false
        map[s[i]] = t[i]
    }
    return true
}

fun isIsomorphic1(s: String, t: String): Boolean {
    var map = HashMap<Char, Char>()
    val index = s.length - 1
    val one = s.toCharArray()
    val two = t.toCharArray()

    for (i in 0..index) {
        if (map[one[i]] != null) {
            if (map[one[i]] != two[i]) return false
        }
        else {
            map[one[i]] = two[i]
        }
    }

    map = HashMap()
    for (i in 0..index) {
        if (map[two[i]] != null) {
            if (map[two[i]] != one[i]) return false
        }
        else {
            map[two[i]] = one[i]
        }
    }
    return true
}