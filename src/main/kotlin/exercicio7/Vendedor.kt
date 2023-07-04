package exercicio7

class Vendedor(val salario: Double, val vendas: Double) {
    fun calcularComessao(): Double {
        val comissaao = vendas * 0.15
        val salarioFinal = comissaao + salario

        return salarioFinal
    }
}