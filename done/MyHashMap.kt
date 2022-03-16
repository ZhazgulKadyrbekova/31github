package done

fun main() {
    val obj = MyHashMap()       //null,
    println(obj.put(1,1))       //null,
    println(obj.put(2,2))       //null,
//    obj.printHashMap()
    println(obj.get(1))         //1,
    println(obj.get(3))         //-1,
    println(obj.put(2,1))       //null,
//    obj.printHashMap()
    println(obj.get(2))         //1,
    println(obj.remove(2)) //null,
//    obj.printHashMap()
    println(obj.get(2))         //-1
}

class MyHashMap {

    private val keys = mutableListOf<Int>()
    private val values = mutableListOf<Int>()

    fun put(key: Int, value: Int) {
        val index = getIndex(key)
        if (index == -1) {
            keys.add(key)
            values.add(value)
        }
        else {
            values[index] = value
        }
    }

    private fun getIndex(key: Int): Int {
        return keys.indexOf(key)
    }

    fun get(key: Int): Int {
        val index = getIndex(key)
        return if (index == -1) index
        else values[index]
    }

    fun remove(key: Int) {
        val index = getIndex(key)
        if (index != -1) {
            keys.removeAt(index)
            values.removeAt(index)
        }
    }

    fun printHashMap() {
        for (i in keys)
            print("$i\t")
        println()
        for (i in values)
            print("$i\t")
        println()
    }
}