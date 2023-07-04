package exercicio2

fun main(){
    println("Digite um numero de 1 a 7, para representar o dia da semana")
    val valor = readln().toInt()

    DiaDaSemana(valor).diaDaSemana()
}