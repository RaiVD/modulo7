package exercicio12

import java.time.LocalDate

fun main(){
    println("Qual o ano do seu nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull()
    val anoAtual = LocalDate.now().year

    if (anoNascimento != null){
        println("====Linha do tempo====")

        for (i in anoNascimento .. anoAtual) {
            val idade = i - anoNascimento
            println("Ano: $i | Idade: $idade")
        }

    }else{
        println("Ano invalido, tente novamente!")
    }
}