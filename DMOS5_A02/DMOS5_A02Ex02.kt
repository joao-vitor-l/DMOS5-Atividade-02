fun main() {
    val number = 7

    val result = isEvenOrOdd(number)

    println("Número: $number")
    println("Resultado: $result")
}

fun isEvenOrOdd(number: Int): String {
    return if(number % 2 == 0) {
        "Par"
    } else {
        "Ímpar"
    }
}