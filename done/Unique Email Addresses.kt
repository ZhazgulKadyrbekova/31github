fun main() {
//    Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    println(numUniqueEmails(arrayOf("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com")))
}

fun numUniqueEmails(emails: Array<String>): Int {
    val res = mutableSetOf<String>()
    for (i in emails) {
        val arr = i.split("@")
        val domain = arr[1]
        var local = arr[0].split("+")[0]
        local = local.replace(".", "")
        res.add("$local@$domain")
    }
    return res.size
}