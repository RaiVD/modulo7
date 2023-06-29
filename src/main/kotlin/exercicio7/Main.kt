package exercicio7

fun main(){
    println("Qual a base do retangulo: ")
    val base = readln().toDouble()
    println("Qual a altura do retangulo: ")
    val altura = readln().toDouble()

    Calcular(base,altura).calcularArea()
}