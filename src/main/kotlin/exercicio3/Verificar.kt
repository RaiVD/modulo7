package exercicio3

class Verificar(val numero: Double) {
    fun validarNumero(){
        val resto = numero % 5
        if (resto == 0.0) {
            println("$numero é múltiplo de 5.")
        } else {
            println("$numero não é múltiplo de 5.")
        }
    }
}