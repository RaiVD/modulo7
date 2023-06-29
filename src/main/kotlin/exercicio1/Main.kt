package exercicio1
fun main() {
    println("Digite um numero inteiro: ")
    val numeroInteiro = readln().toInt()
    println("Numero atual: $numeroInteiro")
    antecessor(numeroInteiro)
}
fun antecessor(numero: Int){
    val valor = numero - 1
    println("Numero antecessor: $valor")
}