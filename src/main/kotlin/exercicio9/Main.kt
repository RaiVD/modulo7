package exercicio9

import java.lang.IllegalArgumentException

fun main(){
    var encerrar = false
    while (!encerrar) {
        println("Digite o primeiro valor: ")
        val primeiroNumero = readln().toDouble()
        println("Digite o segundo valor: ")
        val segundoNumero = readln().toDouble()

        println("================= MENU =================")
        println("Qual operação você deseja realizar: ")
        println("1. Somar\t     2.Subtrair")
        println("3. Multiplicar\t 4. Dividir")
        println("5. Encerrar")
        val opcao = readln().toInt()

        when (opcao) {
            1 -> Calculo(primeiroNumero, segundoNumero).somar()
            2 -> Calculo(primeiroNumero, segundoNumero).subtrair()
            3 -> Calculo(primeiroNumero, segundoNumero).mutiplicar()
            4 -> Calculo(primeiroNumero, segundoNumero).dividir()
            5 -> encerrar = true
            else -> println("Opção inválida, tente novamente")
        }
    }
}