fun main() {
//    println(reverseVowels("hello"))
//    println(reverseVowels("leetcode"))
    println(reverseVowels("aA"))
}

fun reverseVowels(s: String): String {
    val VOWELS = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val vowels = mutableListOf<Char>()
    val vowelsIndex = mutableListOf<Int>()
//    val list = listOf<String>()
    val arr = s.toCharArray()
    for ((index,char) in arr.withIndex()) {
        if (VOWELS.contains(char)) {
            vowels.add(char)
            vowelsIndex.add(index)
        }
    }
    println(vowels)
    val size = vowels.size - 1
    for ((index, i) in vowelsIndex.withIndex()) {
        arr[i] = vowels[size - index]
    }
    return arr.joinToString("")
}