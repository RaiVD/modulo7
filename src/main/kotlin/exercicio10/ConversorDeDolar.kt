package exercicio10

class ConversorDeDolar{
    fun conversao(dolar: Double) {
        val cotacaoDolar = 4.0
        val valorReal = cotacaoDolar * dolar
        val formatoValorReal = "%.2f".format(valorReal)

        println("A cotação do dólar está $cotacaoDolar")
        println("O valor em reais é: R$ $formatoValorReal")
    }
}