import java.util.*

//A
fun main() {
    val scanner: Scanner = Scanner(System.`in`);
    val size = scanner.nextInt();
    var res = "";
    for (i in 0..(size - 1)) {
        var text = scanner.next();
        var n = text.length
        for (j in (n-1) downTo 0) {
            if (text[j] == '0') {
                continue;
            }
            if (text[j].isDigit()) {
                res = text.substring(0, j);
                break;
            }
        }
        println(res);
    }

}
