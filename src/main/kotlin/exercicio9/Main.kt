package exercicio9

fun main() {
    println("Quantos funcionarios existe na empresa: ")
    val quantidade = readln().toInt()

    Funcionario().listaFuncionariosFerias(quantidade)

}
