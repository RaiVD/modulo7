package exercicio4

fun main() {
    println("Quantos animais tem na loja?")
    val totalAnimais = readln().toInt()

    val gato = IntArray(totalAnimais)
    val cachorro = IntArray(totalAnimais)

    for (i in 0 until totalAnimais) {
        println("Qual o tipo do animal ${i + 1}: 1. Gato\t | \t2. Cachorro")
        val animal = readln().toInt()

        if (animal == 1) {
            gato[i] = animal
        } else {
            cachorro[i] = animal
        }
    }
    val quantidadeDeGatos = gato.count { it == 1 }
    println("Quantidade de Gatos da loja: $quantidadeDeGatos")

    val quantidadeDeCachorros = cachorro.count { it == 2 }
    println("Quantidade de Cachorros da loja: $quantidadeDeCachorros")
}