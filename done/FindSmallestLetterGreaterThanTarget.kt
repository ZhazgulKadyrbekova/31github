fun main() {
    println(nextGreatestLetter(charArrayOf('c','f','j'),'a'))
    println(nextGreatestLetter(charArrayOf('c','f','j'),'c'))
    println(nextGreatestLetter(charArrayOf('c','f','j'),'d'))
    println(nextGreatestLetter(charArrayOf('a','b'),'z'))
}

fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    val alphabet = charArrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    val index = alphabet.indexOf(target) + 1
    for (i in index..25) {
        if (letters.contains(alphabet[i]))
            return alphabet[i]
    }
    for (i in 0..(index-1)) {
        if (letters.contains(alphabet[i]))
            return alphabet[i]
    }
    return '0'
}