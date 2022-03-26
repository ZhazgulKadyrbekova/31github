import java.util.*

fun main() {
    println(countStudents(intArrayOf(1,1,0,0), intArrayOf(0,1,0,1)))
    println(countStudents(intArrayOf(1,1,1,0,0,1), intArrayOf(1,0,0,0,1,1)))
}

fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    val student: Queue<Int> = LinkedList()
    val sandwich: Queue<Int> = LinkedList()

    for (i in students.indices) {
        student.add(students[i])
        sandwich.add(sandwiches[i])
    }

    var size: Int
    var count = 0
    while (!student.isEmpty() && !sandwich.isEmpty()) {
        size = student.size
        if (student.peek() == sandwich.peek()) {
            student.poll()
            sandwich.poll()
            count = 0
        }
        else {
            val first = student.poll()
            student.add(first)
            count++
        }
        if (count >= size) {
            return size
        }
    }
    return 0
}