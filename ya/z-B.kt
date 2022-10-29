import java.io.File
import java.io.FileWriter
import java.util.*

fun main() {
    val exists = File("input.txt").exists()
    println(exists)
    val path = if (exists) File("input.txt").absolutePath else ""
    println(path)
    val file = File(path)
    val scanner = Scanner(file)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val sum = sum(a,b)
    File("output.txt")
    val fileWriter = FileWriter("output.txt")
    fileWriter.write(sum.toString())
    fileWriter.close()
    scanner.close()
    println(sum)
}
