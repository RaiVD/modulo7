package exercicio1

fun main() {
    var entrada = false
    while (!entrada) {
        println("Digite um numero inteiro: ")
        val numero = readLine()?.toIntOrNull()

        when(numero != null && numero >= 1){
            true -> {
                println("Resultado de somatória: ${somatoriaDosNumeros(numero)}")
                entrada = true
            }
            false ->{
                println("Valor invalido, tente novamente")
            }
        }
    }
}
fun somatoriaDosNumeros(numeros: Int): Int {

    var somatoria = 0
    for (i in 1..numeros) {
        somatoria += i
    }
    return somatoria
}