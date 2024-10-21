package nonsolved

fun main() {
    println(convert("PAYPALISHIRING", 3))
}

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s
    val size = numRows - 2
    var i = 0
    while (i < size) {

    }

    return s
}

/*
PAYPALISHI R  I  N  G
0123456789 10 11 12 13

3
PAH N  APLSI I  G  YI R
048 12 13579 11 13 26 10

4
PI N  ALS I  G  YAH R  PI
06 12 157 11 13 248 10 39
 */