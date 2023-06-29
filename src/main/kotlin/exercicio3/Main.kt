package exercicio3

fun main(){
    println("Digite um numero: ")
    val multiploDeCinco = readln().toDouble()

    val resto = multiploDeCinco % 5
    if (resto == 0.0) {
        println("$multiploDeCinco é múltiplo de 5.")
    } else {
        println("$multiploDeCinco não é múltiplo de 5.")
    }
}