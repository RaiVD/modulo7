package exercicio11

fun main(){
    println("Qual o valor de custo do produto: ")
    val valorDeCusto = readln().toDouble()
    println("Quantos porcento de acréscimo você gostaria de aplicar no produto: ")
    val porcentagemAcrescimo = readln().toDouble()

    Acrescimo(valorDeCusto,porcentagemAcrescimo).calcularValor()
}
