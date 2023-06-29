package exercicio8

fun main(){
    println("Digite um valor pra X: ")
    val X = readln().toInt()
    println("Digite um valor pra Y: ")
    val Y = readln().toInt()

    ConversaoXEY(X,Y).converterXparaY()
}