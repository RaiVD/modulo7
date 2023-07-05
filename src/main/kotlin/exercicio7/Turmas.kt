package exercicio7

class Turmas {
    fun mediaTurma(qantTurma: Int){
        val mediaTurma = DoubleArray(qantTurma)

        for (i in 0 until mediaTurma.size){
            println("============== Turma ${i+1} ==============")
            println("Quantos alunos tem na turma ${i+1}: ")
            val qantAlunos = readln().toInt()

            val mediasAlunos = DoubleArray(qantAlunos)

            for (y in 0 until qantAlunos){
                println("Qual a média do aluno ${y+1}: ")
                mediasAlunos[y] = readln().toDouble()
            }

            val mediaTurmaAuxiliar = mediasAlunos.average()
            mediaTurma[i] = mediaTurmaAuxiliar
        }

        println("============== Média das Turmas ==============")
        for (i in 0 until mediaTurma.size) {
            println("Média da turma ${i + 1}: ${mediaTurma[i]}")
        }
    }
}