abstract class Employee(
    val name: String, 
    val cpf: String,
    val position: String
    ) {

    abstract fun calculateBenefits(): String
}

open class StaffEmployee(
    name: String,
    cpf: String,
    position: String,
    val salary: Double,
    val hireDate: String
    ) : Employee(name, cpf, position) {

    override fun calculateBenefits(): String {
        return """
            Benefícios empregado:
            Nome: $name
            CPF: $cpf
            Posição: $position
            Salário: R$ $salary
            Data de admissão: $hireDate
        """.trimIndent()
    }
}

class Manager(
    name: String,
    cpf: String,
    position: String,
    salary: Double,
    hireDate: String,
    val bonus: Double
    ) : StaffEmployee(name, cpf, position, salary, hireDate) {
    
    override fun calculateBenefits(): String {
        return """
            Benefícios gerente:
            Nome: $name
            CPF: $cpf
            Posição: $position
            Salário: R$ $salary
            Data de admissão: $hireDate
            Bônus: R$ $bonus
        """.trimIndent()
    }
}

class Intern(
    name: String,
    cpf: String,
    position: String,
    val allowance: Double,
    val educationalInstitution: String
    ) : Employee(name, cpf, position) {

    override fun calculateBenefits(): String {
        return """
            Benefícios estagiário:
            Nome: $name
            CPF: $cpf
            Posição: $position
            Bolsa de auxílio: R$ $allowance
            Instituição de ensino: $educationalInstitution
        """.trimIndent() 
    }
}

fun main() {
    val staffEmployee = StaffEmployee("MC", "123-456-789-10", "Cozinheiro", 3000.0, "01/01/2020")
    val manager = Manager("BK", "987-654-321-00", "Contador", 7000.0, "01/01/2021", 500.0)
    val intern = Intern("KFC", "456-789-012-33", "Garçom", 1100.0, "Universidade Balde Sem Fim")

    println(staffEmployee.calculateBenefits() + "\n")
    println(manager.calculateBenefits() + "\n")
    println(intern.calculateBenefits())
}