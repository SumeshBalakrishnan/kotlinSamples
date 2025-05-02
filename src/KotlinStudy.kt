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
}

