fun main() {
    val celsius = 25.0

    val fahrenheit = celsiusToFahrenheit(celsius)

    println(String.format("Temperatura em Celsius: %.2f °C", celsius))
    println(String.format("Temperatura em Fahrenheit: %.2f °F", fahrenheit))
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}