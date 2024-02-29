data class Product(val name: String, val price: Double, val description: String, val qttStock: Int) {
    fun displayInfo(): String {
        return """
            Informações do produto:
            Nome: $name
            Preço: R$ $price
            Descrição: $description
            Quantidade em estoque: $qttStock
        """.trimIndent()
    }
}

fun main() {
    val product = Product("Bumerangue", 7.5, "Vai e volta", 70)
    println(product.displayInfo())
}