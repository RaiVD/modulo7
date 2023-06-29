package exercicio8

class ConversaoXEY (val X: Int, val Y: Int) {
    fun converterXparaY(){
        val novoY = X
        val novoX = Y

        println("Valor de X: $novoX")
        println("Valor de Y: $novoY")
    }
}