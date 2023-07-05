package exercicio4

fun main() {
    println("Quantos animais tem na loja?")
    val totalAnimais = readln().toInt()

    Animais().classificarAnimal(totalAnimais)
}
