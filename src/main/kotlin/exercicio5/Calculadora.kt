package exercicio5

class Calculadora(val numUm: Double, val numDois: Double) {

    fun somar(){
        val somar = numUm + numDois
        println("Resultado: $somar")
    }
    fun subtrair(){
        val subitrair = numUm - numDois
        println("Resultado: $subitrair")
    }
    fun mutiplicar(){
        val mutiplica = numUm * numDois
        println("Resultado: $mutiplica")
    }
    fun dividir(){
        val dividir = numUm / numDois
        println("Resultado: $dividir")
    }

}