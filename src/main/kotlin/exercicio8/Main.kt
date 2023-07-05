package exercicio8

fun main(){
    println("Digite seu nome completo: ")
    val nome = readln()

    separarNome(nome)
}
fun separarNome(nome: String){
    val palavra = nome.split(" ")

    for (palavras in palavra){
        println(palavras)
    }
}