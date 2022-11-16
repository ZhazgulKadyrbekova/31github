fun main() {
    println(getHint("1234", "0111"))
    println(getHint("1122", "2211"))
//    println(getHint("1123", "0111"))
}

fun getHint(secret: String, guess: String): String {
    var i = 0; var bulls = 0
    val fir = hashMapOf<Char, Int>(); val sec = hashMapOf<Char, Int>()
    while (i < secret.length) {
        if (secret[i] == guess[i]) bulls++
        else {
            fir[secret[i]] = fir.getOrDefault(secret[i], 0) + 1
            sec[guess[i]] = sec.getOrDefault(guess[i], 0) + 1
        }
        i++
    }

    println(fir)
    println(sec)
    var cows = 0
    for (key in fir.keys) {
        if (sec[key] != null) {
            cows += Math.min(fir[key]!!, sec[key]!!)
        }
    }
    return "${bulls}A${cows}B"
}