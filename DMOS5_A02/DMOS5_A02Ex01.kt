fun main() {
    try {
        val height = 1.74
        val weight = 74.0

        val imc = calcImc(height, weight)

        println(String.format("Altura: %.2fcm", height))
        println(String.format("Peso: %.2fkg", weight))
        println(String.format("IMC: %.2f", imc))
    } catch(e: IllegalArgumentException) {
        println("Erro: ${e.message}")
    }
}

fun calcImc(height: Double, weight: Double): Double {
    if(height <= 0 || weight <= 0) {
        throw IllegalArgumentException("Altura e peso devem ser valores positivos.")
    }

    return weight / (height * height)
}