package exercicio3

fun main() {
    println("Qual seu peso: ")
    val peso = readln().toDouble()
    println("Qual sua altura: ")
    val altura = readln().toDouble()

    val imc = calcularIMC(peso, altura)

    println("Calculo do seu IMC: $imc")
    println("Classificação do IMC: ${classificarImc(imc)}")
}
fun calcularIMC(peso: Double, altura: Double): Double {
    val imc = peso / (altura * altura)
    return imc
}
fun classificarImc(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 25 -> "Peso normal"
        imc < 30 -> "Sobrepeso"
        imc < 35 -> "Obesidade Grau I"
        imc < 40 -> "Obesidade Grau II (severa)"
        else -> "Obesidade Grau III (mórbida)"
    }

}