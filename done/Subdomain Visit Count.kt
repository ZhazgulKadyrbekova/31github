fun main() {
    val arr = subdomainVisits(arrayOf("900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"))
    for (i in arr)
        println(i)
}

fun subdomainVisits(cpdomains: Array<String>): List<String> {
    val map = HashMap<String, Int>()
    for (text in cpdomains) {
//        println(text)
        val arr = text.split(" ")
        val count = arr[0].toInt()
        var domain = arr[1]
        while (domain.isNotBlank()) {
//            println(domain)
            map[domain] = map.getOrDefault(domain, 0) + count
            val ind = domain.indexOf('.')
            if (ind == -1) break
            domain = domain.substring(ind + 1)
        }
//        println(map)
//        println()
    }
    val list = mutableListOf<String>()
    for (entry in map.entries) {
        list.add("${entry.value} ${entry.key}")
    }
    return list
}