package exercicio9

class Funcionario(){
    fun listaFuncionariosFerias(quantidade: Int){
        val funcionariosComFerias = IntArray(quantidade)
        val funcionariosSemFerias = IntArray(quantidade)

        for (i in 0 until quantidade) {
            println()
            println("Qual o nome do(a) funcionario(a) ${i + 1}: ")
            val nome = readln()
            println("Qual o tempo de serviço do(a) funcionario(a) $nome (em meses): ")
            val tempo = readln().toInt()

            if (tempo > 12) {
                println("$nome tem direito a férias!")
                funcionariosComFerias[i] += 1
            } else {
                println("$nome não tem direito a férias!")
                funcionariosSemFerias[i] += 1
            }
        }
        println("============================ Iformações dos funcionarios ============================")
        val quantidadeComFerias = funcionariosComFerias.count { it == 1 }
        println("Funcionarios com direito a férias: $quantidadeComFerias")

        val quantidadeSemFerias = funcionariosSemFerias.count { it == 1 }
        println("Funcionarios sem direito a férias: $quantidadeSemFerias")
    }
}