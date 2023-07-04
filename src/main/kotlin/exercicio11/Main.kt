package exercicio11

fun main(){
    val quantidadeDeNumeros = 15
    var soma = 0.0

    println("A media dos 15 numeros informados é: ${media(quantidadeDeNumeros, soma).caucularMedia()}")
}
class media(val qnt: Int, var somar: Double){

    fun caucularMedia(): Double{
        for (i in 1 .. qnt){
            println("Digite o numero $i: ")
            var numeros = readLine()?.toIntOrNull()

            if (numeros != null) {
                somar += numeros
            } else {
                println("Entrada inválida! Tente novamente.")
                break
            }
        }
        val mediaTotal = somar / qnt
        return mediaTotal
    }
}