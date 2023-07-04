package exercicio10

fun main() {
    println("Digite a quantidade de dólares disponíveis:")
    val quantidadeDolares = readln().toDouble()
    Coversao(quantidadeDolares)

}
fun Coversao(dolar: Double) {
    val cotacaoDolar=4.0
    val valorReal = cotacaoDolar * dolar
    println("A cotação do dólar está $cotacaoDolar")
    println("O valor em reais é: R$ $valorReal")

}