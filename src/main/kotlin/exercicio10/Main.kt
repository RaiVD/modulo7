package exercicio10
fun main() {
    println("Digite um numero inteiro: ")
    val numeroInteiro = readln().toInt()
    println("Numero atual: $numeroInteiro")
    sucessor(numeroInteiro)

}
fun sucessor(numero: Int){
    val valor = numero + 1
    println("Numero sucessor: $valor")
}