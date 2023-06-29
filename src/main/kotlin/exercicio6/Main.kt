package exercicio6

fun main(){
    println("Digite o valor em dólar a ser convertido: ")
    val valorConversao = readln().toDouble()

    println("O valor em reais é: ${ConversaoDolar(valorConversao).conversaoDolar()}")
}