data class Car(val brand: String, val model: String, val year: Int, val licensePlate: String) {
    fun displayInfo(): String {
        return """
            Informações do carro:
            Marca: $brand
            Modelo: $model
            Ano: $year
            Placa: $licensePlate
        """.trimIndent()
    }
}

fun main() {
    val car = Car("Ferrari", "Portofino", 2023, "XYZ798")
    print(car.displayInfo())
}