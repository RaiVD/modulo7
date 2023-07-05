package exercicio2

fun main (){
    var entrada = false
    while (!entrada) {
        println("Digite seu nome: ")
        val nome= readlnOrNull()

        when (nome != null) {
            true -> {
                println(retorneNome(nome))
                entrada = true
            }
            false -> {
                println("Valor invalido, tente novamente")
            }
        }
    }
}
fun retorneNome (nome: String):String{
    return "Meu nome é <$nome>"
}