package exercicio8

class CalcularMedia(val notas: DoubleArray){
    fun calcularMedia(): Double {
        var soma = 0.0
        for (nota in notas) {
            soma += nota
        }
        val mediaFinal =  soma / notas.size
        return mediaFinal
    }
}