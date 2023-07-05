package exercicio9

fun main() {
    println("Quantos funcionarios existe na empresa: ")
    val quantidade = readln().toInt()

    val funcionariosComFerias = IntArray(quantidade)
    val funcionariosSemFerias = IntArray(quantidade)

    for (i in 0 until quantidade) {
        println("Qual o nome do funcionario ${i + 1}: ")
        val nome = readln()
        println("Qual o temdo de serviço do funcionario $nome (em meses): ")
        val tempo = readln().toInt()

        if (tempo > 12) {
            println("$nome tem direito a férias!")
            funcionariosComFerias[i] += 1
        } else {
            println("$nome não tem direito a férias!")
            funcionariosSemFerias[i] += 1
        }
    }
    val quantidadeComFérias = funcionariosComFerias.count { it == 1 }
    println("Funcionarios com direito a férias: $quantidadeComFérias")

    val quantidadeSemFérias = funcionariosSemFerias.count { it == 1 }
    println("Funcionarios sem direito a férias: $quantidadeSemFérias")
}