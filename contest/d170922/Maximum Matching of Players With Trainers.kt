fun main() {
    println(matchPlayersAndTrainers(intArrayOf(4,7,9), intArrayOf(8,2,5,8)))
    println(matchPlayersAndTrainers(intArrayOf(1,1,1), intArrayOf(10)))
}

fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
    players.sort(); trainers.sort()
    var count = 0
    var i = 0
    var j = 0
    while (i < players.size && j < trainers.size) {
        if (players[i] > trainers[j]) {
            j++; continue
        }
        if (players[i] <= trainers[j]) {
            count++; i++; j++
        }
    }
    return count
}