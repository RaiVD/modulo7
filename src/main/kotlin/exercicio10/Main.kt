package exercicio10

fun main(){
    println("Digite um valor para X: ")
    val x = readln().toDouble()
    println("Digite um valor para Y: ")
    val y = readln().toDouble()

    if (x == y){
        println("X e Y são iguais")
    }else{
        println("X e Y são diferentes")
    }
}