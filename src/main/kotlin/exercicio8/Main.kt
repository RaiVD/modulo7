package exercicio8

fun main(){
    println("Quantos alunos você deseja verificar a nota: ")
    val quantidadeDeAluno = readln().toInt()

    println(Medias().alunosENotas(quantidadeDeAluno))
}

