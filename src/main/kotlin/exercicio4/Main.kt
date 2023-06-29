package exercicio4

fun main(){
    println("Qual a temperatuta atual em graus Célsius")
    val respostaTemperatura = readln().toDouble()
    Temperatura(respostaTemperatura).validarTemperatura()
}