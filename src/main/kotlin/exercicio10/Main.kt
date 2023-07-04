package exercicio10

fun main() {
    var numero = 1
    var soma = 0

    println("A soma dos números de 1 a 15 é: ${somaDeNumeros(soma,numero).somar()}")
}
class somaDeNumeros(var soma: Int, var numero: Int){
    fun somar(): Int{
        do {
            soma += numero
            println(numero)
            numero++
        } while (numero <= 15)
        return soma
    }
}