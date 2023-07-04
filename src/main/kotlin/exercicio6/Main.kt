package exercicio6

fun main() {
    print("Quantos numeros deseja informar: ")
    val qntNum = readln().toInt()


    println("O menor número informado é: ${VerificarMenorNumero(qntNum).verificar()}")
}
