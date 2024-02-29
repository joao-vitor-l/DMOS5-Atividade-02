data class Client(val name: String, val address: String, val phoneNumber: String, val birthDate: String) {
    fun displayInfo(): String {
        return """
            Informações do cliente:
            Nome: $name
            Endereço: $address
            Telefone: $phoneNumber
            Data de nascimento: $birthDate
        """.trimIndent()
    }
}

fun main() {
    val client = Client("Lula Lolusco", "Oceania", "12345-67890", "29/09/2000")
    println(client.displayInfo())
}