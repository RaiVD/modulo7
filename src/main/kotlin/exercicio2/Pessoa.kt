package exercicio2
class Pessoa(val idade: Int) {
    fun diasDeVida(){
        if (idade >= 0) {
            val diasVividos = calcularDiasVividos()
            println("Dias vividos: $diasVividos")
        } else {
            println("Idade inválida.")
        }

    }
    fun calcularDiasVividos(): Int {
        return idade * 365
    }
}