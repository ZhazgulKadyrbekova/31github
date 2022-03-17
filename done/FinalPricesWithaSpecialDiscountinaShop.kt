fun main() {
    val arr = finalPrices(intArrayOf(10,1,1,6))
    for (i in arr)
        println(i)
}

fun finalPrices(prices: IntArray): IntArray {
    val size = prices.size - 1
    val res = mutableListOf<Int>()
    var flag: Boolean

    for (i in 0..size) {
        flag = false
        for (j in (i+1)..size) {
            if (prices[j] <= prices[i]) {
                res.add(prices[i] - prices[j])
                flag = true
                break
            }
        }
        if (!flag)
            res.add(prices[i])
    }

    return res.toIntArray()
}