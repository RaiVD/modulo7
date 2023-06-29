package exercicio1
fun main() {
    println("Digite um numero inteiro: ")
    val numeroInteiro = readln().toInt()
    println("Numero atual: $numeroInteiro")
    Antecessor(numeroInteiro).antecessor()
}
