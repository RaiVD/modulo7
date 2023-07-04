package exercicio8

fun main(){
    println("Quantos alunos você deseja verificar a nota: ")
    val quantidadeDeAluno = readln().toInt()

    println(alunosMedia(quantidadeDeAluno))
}
fun alunosMedia(quantidadeDeAluno: Int){
    val vetorAlunos = arrayOfNulls<String>(quantidadeDeAluno)
    val vetorNotas = Array(quantidadeDeAluno){DoubleArray(3)}

    for (i in 0 until  quantidadeDeAluno) {
        println("Digite o nome do aluno ${i+1}: ")
        vetorAlunos[i] = readLine()

        for (x in 0 until  3){
            println("Digite a nota ${x+1} do aluno: ")
            vetorNotas[i][x] = readln().toDouble()
        }
    }
    println("================= Informações dos alunos=================")
    for (i in 0 until quantidadeDeAluno) {
        println("Aluno: ${vetorAlunos[i]} \nMédia: ${CalcularMedia(vetorNotas[i]).calcularMedia()}")
    }
}
