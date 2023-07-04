package exercicio7

fun main(){
    println("Qual o nome do vendedor: ")
    val nome = readLine()
    println("Qual o salario fixo do vendedor $nome: ")
    val salario = readln().toDouble()
    println("Quantas vendas em reais foram efetuadas pelo vendedor $nome: ")
    val totalDeVendas = readln().toDouble()

    val salarioFinal = Vendedor(salario,totalDeVendas).calcularComessao()
    val formatoSalario = "%.2f".format(salarioFinal)


    println("==========Iformaçoes Gerais Do Vendedor $nome==========")
    println(" Nome: $nome \n Salario fixo: $salario \n Salario final com comissão: $formatoSalario ")
}