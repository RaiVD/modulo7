package exercicio7

fun main (){
    println("Digite o número de alunos na sala:")
    val quantidadeAlunos = readLine()?.toIntOrNull()

    if (quantidadeAlunos != null && quantidadeAlunos > 0) {
        var totalNotas = 0.0
        var contador = 1

        while (contador <= quantidadeAlunos) {
            println("Digite a nota do aluno $contador:")
            val nota = readLine()?.toDoubleOrNull()

            if (nota != null) {
                totalNotas += nota
                contador++
            } else {
                println("Digite uma nota válida.")
            }
        }

        val media = totalNotas / quantidadeAlunos
        println("A média da turma é: $media")
    } else {
        println("Digite um número válido de alunos.")
    }
}