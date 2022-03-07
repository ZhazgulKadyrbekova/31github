fun main() {
    /*
    ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[0],[0]]
     */
    val obj = MyLinkedList()
    println("-  $obj")

//    obj.addAtHead(1)
//    println("-  $obj")
//
    obj.addAtTail(1)
    println("-  $obj")

//    obj.addAtIndex(0,10)
//    println("-  $obj")
//
//    obj.addAtIndex(0,20)
//    println("-  $obj")
//
//    obj.addAtIndex(1,30)
//    println("-  $obj")

    val param1 = obj.get(0)
//    obj.deleteAtIndex(0)
//    println("-  $obj")

    val param2 = obj.get(0)

    println("$param1\t$param2")
}

class MyLinkedList {
    var head: Node? = null
    var length: Int = 0

    fun get(index: Int): Int {
        var counter = 0
        var node = head
        while (counter < index) {
            node = node?.next
            counter++
        }
        return node?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        head = Node(`val`, head)
        length += 1
    }

    fun addAtTail(`val`: Int) {
        if (head == null) {
            head = Node(`val`, null)
            return
        }
        var node = head
        while (node?.next != null) {
            node = node.next
        }
        node?.next = Node(`val`, null)
        length += 1
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index > length) return
        if (index == 0) {
            head = Node(`val`, head)
            return
        }
        var counter = 1
        var node = head
        while (counter < index) {
            node = node?.next
            counter++
        }
        node?.next = Node(`val`, node?.next)
        length += 1
    }

    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= length) return
        if (index == 0) {
            head = head?.next
            return
        }
        var counter = 0
        var node = head
        while (counter < index) {
            node = node?.next
            counter++
        }
        node?.next = node?.next?.next
        length -= 1
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        var node = head
        for (i in 0..(length-1)) {
            stringBuilder.append(node?.`val`).append("  ")
            node = node?.next
        }
        return stringBuilder.append("\tsize: ").append(length).toString()
    }
}

class Node(value: Int, nextOrNull: Node?) {
    var `val`: Int = value
    var next: Node? = nextOrNull
}