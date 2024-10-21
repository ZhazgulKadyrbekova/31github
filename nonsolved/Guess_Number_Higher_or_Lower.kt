package nonsolved//fun nonsolved.main() {
//    val solution = Solution()
//    println(solution.guessNumber(10))
//}
//
//class Solution: GuessGame() {
//    fun guessNumber(n:Int):Int {
//        return func(1, n)
//    }
//
//    fun func(left: Int, right: Int): Int {
//        println("$left\t$right")
////        if (left >= right)
//        var mid = (left + right) / 2
//        val guessed = this.guess(mid)
//        if (guessed == 0) return guessed
//        else if (guessed == 1) return func(left, mid)
//        else return func(mid,right)
//    }
//}
//
//Line 11: Char 9: error: 'guessNumber' hides member of supertype 'GuessGame' and needs 'override' modifier
//fun guessNumber(n:Int):Int {
//    ^
//open class GuessGame {
//    val pick = 6
//    fun guess(num:Int):Int {
//        return  if (num < pick) -1
//                else if (num > pick) 1
//                else 0
//
//    }
//}