fun main() {
    val node1 = TreeNode(10)
    val node2 = TreeNode(5)
    val node3 = TreeNode(15)
    val node4 = TreeNode(3)
    val node5 = TreeNode(7)
    val node6 = TreeNode(18)
    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.right = node6

    println(rangeSumBST(node1,7,15))
}

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    return getSum(root, low, high, 0)
}

fun getSum(root: TreeNode?, low: Int, high: Int, sum: Int): Int {
    println(root!!.`val`)
    println(sum)
    println()
    var newSum = sum
    if (root.left != null) {
        newSum = getSum(root.left, low, high, sum)
    }
    if (root.right != null) {
        return getSum(root.right, low, high, sum)
    }
    if (root.`val` in (low..high))
        return sum+root.`val`
    else return sum
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}