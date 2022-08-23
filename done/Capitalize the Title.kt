fun main() {
    println(capitalizeTitle("capiTalIze tHe titLe"))
    println(capitalizeTitle("capiTalIze tH titLe"))
}

fun capitalizeTitle(title: String): String {
    val words = title.split(" ")
    val stringBuilder = StringBuilder()
    for (word in words) {
        if (word.length > 2) {
            stringBuilder.append(word.toLowerCase().capitalize())
        }
        else {
            stringBuilder.append(word.toLowerCase())
        }
        stringBuilder.append(" ")
    }
    return stringBuilder.toString().trim()
}