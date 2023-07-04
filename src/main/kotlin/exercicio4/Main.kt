package exercicio4

fun main(){
    println("Qual a base do retangulo: ")
    val base = readln().toDouble()
    println("Qual a altura do retangulo: ")
    val altura = readln().toDouble()

    calcularArea(base,altura)
}
fun calcularArea(base: Double, altura: Double){
    val calculoDaArea = base * altura
    println("A área desse retângulo é: $calculoDaArea")

}