package exercicio4

class Animais() {
    fun classificarAnimal(totalAnimais: Int) {
        val gato = IntArray(totalAnimais)
        val cachorro = IntArray(totalAnimais)

        for (i in 0 until totalAnimais) {
            println("Qual o tipo do animal ${i + 1}: 1. Gato\t | \t2. Cachorro")
            val animal = readln().toInt()

            when (animal) {
                1 -> {
                    gato[i] = animal
                }
                2 -> {
                    cachorro[i] = animal
                }
                else -> {
                    println("Valor invalido, tente novamente!")
                }
            }
        }
        val quantidadeDeGatos = gato.count { it == 1 }
        println("Quantidade de Gatos da loja: $quantidadeDeGatos")

        val quantidadeDeCachorros = cachorro.count { it == 2 }
        println("Quantidade de Cachorros da loja: $quantidadeDeCachorros")
    }
}