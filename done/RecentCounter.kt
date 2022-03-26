package done

fun main() {
    val obj = RecentCounter()
    println(obj.ping(1))
    println(obj.ping(100))
    println(obj.ping(3001))
    println(obj.ping(3002))
}
class RecentCounter() {
    private val requests = mutableListOf<Int>()
    var size = 0

    fun ping(t: Int): Int {
        requests.add(t)
        size++

        val range = intArrayOf(t-3000, t)
        for (i in 0..size)
            if (requests[i] >= range[0])
                return size - i

        return 0
    }
}