package exercicio9

fun main(){
    var entrada = false
    while (!entrada) {
        println("Qual a temperatura atual em graus Celsius: ")
        val temperaturaC = readLine()?.toDoubleOrNull()

        when(temperaturaC != null){
            true-> {
                val fahrenheit = (9 * temperaturaC + 160) / 5
                println("Temperatura atual em Fahrenheit: $fahrenheit")
                entrada = true
            }
            false -> {
                println("Não é possivel informar valor nulo, tente denovo!")
            }
        }
    }
}