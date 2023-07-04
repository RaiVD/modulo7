package exercicio1

fun main() {
    val tamanhoDoVetor = 5
    val vetor = IntArray(tamanhoDoVetor)

    println("=====Digite $tamanhoDoVetor numeros inteiros=====")

    for (i in 0 until  tamanhoDoVetor) {
        print("Digite um valor inteiro: ")
        vetor[i] = readln().toInt()
    }
    val soma = vetor.sum()
    println("A soma dos valores é: $soma")


}