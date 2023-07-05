package exercicio1

class VerificarNumeros() {
    fun somarNumeros(numUm: Int, numDois: Int) {
        var soma = 0

        for (num in numUm..numDois) {
            if (num % 13 != 0) {
                soma += num
            }
        }
        println("A soma dos números que não são múltiplos de 13 entre $numUm e $numDois é: $soma")
    }
}