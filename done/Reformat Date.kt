fun main() {
    println(reformatDate("20th Oct 2052"))
    println(reformatDate("26th May 1960"))
}

fun reformatDate(date: String): String {
    val stringBuilder = StringBuilder()
    val arr = date.split(" ")
    val months = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")

    val year = arr[2]
    stringBuilder.append(year).append('-')

    var month = arr[1]
    month = (months.indexOfFirst { month == it } + 1).toString()
    if (month.length == 1) {
        stringBuilder.append('0').append(month).append('-')
    }
    else stringBuilder.append(month).append('-')

    var day = arr[0]
    day = day.substring(0, day.length-2)
    if (day.length == 1) {
        stringBuilder.append('0').append(day)
    }
    else stringBuilder.append(day)

    return stringBuilder.toString()
}