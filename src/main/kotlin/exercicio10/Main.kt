package exercicio10
fun main() {
    println("Digite um numero inteiro: ")
    val numeroInteiro = readln().toInt()
    println("Numero atual: $numeroInteiro")

    Sucessor(numeroInteiro).sucessor()

}
