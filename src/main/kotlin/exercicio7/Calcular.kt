package exercicio7

class Calcular(val base: Double, val altura: Double) {
    fun calcularArea() {
        val calculoDaArea = base * altura
        println("A área desse retângulo é: $calculoDaArea")
    }
}