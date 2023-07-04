package exercicio9

fun main(){
    var entrada = false
    while (!entrada) {
        println("Qual a temperatura atual em graus Celsius: ")
        val temperaturaC = readLine()?.toDoubleOrNull()

        when(temperaturaC != null){
            true-> {
                println("Temperatura atual em Fahrenheit: ${convertertemperatura(temperaturaC)}")
                entrada = true
            }
            false -> {
                println("Não é possivel informar valor nulo, tente denovo!")
            }
        }
    }
}
fun convertertemperatura(temperaturaC: Double): Double{
    val fahrenheit = (9 * temperaturaC + 160) / 5
    return fahrenheit
}