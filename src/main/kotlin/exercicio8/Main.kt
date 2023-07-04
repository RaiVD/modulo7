package exercicio8

fun main(){
    println("Quantos alunos você deseja verificar a nota: ")
    val quantidadeDeAluno = readln().toInt()

    println(medias().alunosMedia(quantidadeDeAluno))
}
class medias() {
    fun alunosMedia(quantidadeDeAluno: Int) {
        val vetorAlunos = arrayOfNulls<String>(quantidadeDeAluno)
        val vetorNotas = Array(quantidadeDeAluno) { DoubleArray(3) }

        for (i in 0 until quantidadeDeAluno) {
            println("Digite o nome do aluno ${i + 1}: ")
            vetorAlunos[i] = readLine()

            for (x in 0 until 3) {
                println("Digite a nota da prova ${x + 1} do aluno: ")
                vetorNotas[i][x] = readln().toDouble()
            }
        }
        println("================= Informações dos alunos=================")
        for (y in 0 until quantidadeDeAluno) {
            val media = calcularMedia(vetorNotas[y])
            val formatoIMedia = "%.2f".format(media)

            val aluno = vetorAlunos[y]
            println("Aluno: $aluno \nMédia: $formatoIMedia")
        }
    }
    fun calcularMedia(notas: DoubleArray): Double {
        var soma = 0.0
        for (nota in notas) {
            soma += nota
        }
        val mediaFinal = soma / notas.size
        return mediaFinal
    }
}
