fun main() {
    reachableFunction(10986487)
}

tailrec fun removeZeros(x: Int): Int = if (x % 10 == 0) removeZeros(x / 10) else x

fun f(x: Int) = removeZeros(x +1)

fun reachableFunction(input: Int) {
    val reachableNumbersFrom = mutableSetOf<Int>()
    var containsReachableNumber = false
    var x = input
    while (!containsReachableNumber) {
        val y = f(x)
        if (reachableNumbersFrom.contains(y)) containsReachableNumber = true else {
            reachableNumbersFrom.add(x)
            x = y
        }
    }
    println("output: ${reachableNumbersFrom.size + 1}")
}