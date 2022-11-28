fun main() {
    val obj = UndergroundSystem()
    obj.checkIn(45,"Leyton",3)
    obj.checkIn(32,"Paradise",8)
    obj.checkIn(27,"Leyton",10)
    obj.checkOut(45,"Waterloo",15)
    obj.checkOut(27,"Waterloo",20)
    obj.checkOut(32,"Cambridge",22)
    println(obj.getAverageTime("Paradise","Cambridge"))         //14
    println(obj.getAverageTime("Leyton","Waterloo"))            //11
    obj.checkIn(10,"Leyton",24)
    println(obj.getAverageTime("Leyton","Waterloo"))            //11
    obj.checkOut(10,"Waterloo",38)
    println(obj.getAverageTime("Leyton","Waterloo"))            //12
}


class UndergroundSystem {
    private val customers = mutableListOf<Customer>()
    private val trips = mutableListOf<Trip>()

    fun checkIn(id: Int, stationName: String, t: Int) {
        customers.add(Customer(id, stationName, t))
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val customer = customers.find { it.id == id }!!
        val index = customers.indexOf(customer)
        customers.removeAt(index)
        trips.add(Trip(customer.stationName, stationName, t - customer.time))
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        val tripsOnStation = trips.filter { it.startStation == startStation && it.endStation == endStation }
        var sum = 0
        tripsOnStation.forEach { sum += it.time }
        return sum.toDouble() / tripsOnStation.size
    }
}

class Customer(
    val id: Int,
    val stationName: String,
    val time: Int
)

class Trip(
    val startStation: String,
    val endStation: String,
    val time: Int
)