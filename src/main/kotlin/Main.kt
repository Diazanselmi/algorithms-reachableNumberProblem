fun main() {
    //set the input
    reachableFunction(1098)
}

tailrec fun removeZeros(x: Int): Int = if (x % 10 == 0) removeZeros(x / 10) else x

fun f(x: Int) = removeZeros(x + 1)

fun reachableFunction(input: Int) {
    val reachableNumbersFrom = mutableSetOf<Int>()
    var x = input
    while (!reachableNumbersFrom.contains(x)) {
        reachableNumbersFrom.add(x)
        x = f(x)
    }
    println("${reachableNumbersFrom.size}")
}