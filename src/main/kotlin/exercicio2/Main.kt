package exercicio2

fun main() {
    println("Digite a idade da pessoa: ")
    val respostaIdade = readln().toInt()

    Pessoa(respostaIdade).diasDeVida()
}
