fun main() {
    higherOrderFunction { a, b -> a.plus(b) }
    val multiplier = getMultiplier(5)
    println("==Result :" + multiplier(2))

    higherOrderFunctionSum(::add)
}

//Example 1: Passing a Lambda as a Parameter
fun higherOrderFunction(operation: (Int, Int) -> Int) {
    val result = operation(5, 3)
    println("The result is: $result")
}

//Example 2: Returning a Function
fun getMultiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

//Example 3: Using Function References
fun add(a: Int, b: Int): Int = a + b
fun higherOrderFunctionSum(operation: (Int, Int) -> Int) {
    val result = operation(10, 5)
    println("The result is: $result")
}
