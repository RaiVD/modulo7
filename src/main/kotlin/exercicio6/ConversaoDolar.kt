package exercicio6

class ConversaoDolar(val dolar: Double) {
    fun conversaoDolar(): Double{
        val cotacaoAtual = 4.85
        return dolar * cotacaoAtual
    }
}