fun main() {
    val numbers = arrayOf(5, 4, 8, 9, 6, 10, -7, 111)

    var max = numbers[0]
    var min = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        } else if (numbers[i] < min) {
            min = numbers[i]
        }
    }
    println("===MAX=== $max")
    println("====MIN===== $min")
}