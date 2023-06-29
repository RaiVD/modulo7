package exercicio5

fun main(){
    println("Digite um número: ")
    val resposta= readln().toDouble()

    if (resposta<0){
        println("O número que você digitou é negativo")
    }
    else{
        println("O número que você digitou é positivo")
    }

}