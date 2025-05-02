fun main() {
    var name: String? = null  // You can change this to "ChatGPT" to test

   /* if (name != null) {
        println("Test 1")
    } else {
        println("Test 2")
    }*/

    name?.let {
        println("Test 1: name is not null, value = $it")
    } ?: run {
        println("Test 2: name is null")
    }

    println("Length : " + getStringLength(name))
    println("Reverse 1 : " + reverseString(name))
    println("Reverse 2 : " + reverseStringManul(name))
}

fun getStringLength(str: String?): Int {
    return str?.length ?: -1
}

fun reverseString(input: String?): String? {
    return input?.reversed()
}

fun reverseStringManul(input: String?): String? {
    var reversed = ""
    for (i in input?.length?.minus(1)?.downTo(0)!!) {
        reversed += input[i]
    }
    return reversed
}