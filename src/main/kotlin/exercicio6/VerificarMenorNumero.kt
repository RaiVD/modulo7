package exercicio6

class VerificarMenorNumero (val quantidade: Int) {
    fun verificar(): Int{

        val vetor = IntArray(quantidade)
        for (i in 0 until  quantidade) {
            println("Digite o numero ${i+1}: ")
            vetor[i] = readln().toInt()
        }

        var menor = vetor[0]
        for (x in 1 until quantidade) {
            if (vetor[x] < menor) {
                menor = vetor[x]
            }
        }

        return menor
    }
}