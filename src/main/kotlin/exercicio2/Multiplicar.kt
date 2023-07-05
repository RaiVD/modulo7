package exercicio2

class Multiplicar {
    fun multiplicar(valor: Int){
        val vetorNum = IntArray(10)
        vetorNum[0] = valor

        val multiplica = 2

        for (i in 1 until vetorNum.size){
            vetorNum[i] = vetorNum[i - 1] * multiplica
        }
        println("============Vetor de numeros============")
        println(vetorNum.joinToString())
    }
}