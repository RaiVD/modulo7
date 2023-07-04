package exercicio3

fun main() {
    println("Qual seu peso: ")
    val peso = readln().toDouble()
    println("Qual sua altura: ")
    val altura = readln().toDouble()

    val imc = IMC().calcularIMC(peso, altura)
    val formatoImc = "%.2f".format(imc)

    println("Calculo do seu IMC: $formatoImc")
    println("Classificação do IMC: ${IMC().classificarImc(imc)}")
}

