package exercicio6
fun main() {
    println("Digite o nome da banda: ")
    val nomeBanda = readLine()

    val musicas = Array(3){""}

    var i =0
    while (i < 3) {
        println("Digite o nome da música ${i + 1}: ")
        musicas[i] = readln()
        i++
    }

    println("========== Dados da Banda ==========")
    println("Banda: $nomeBanda")
    for (x in 0 until   musicas.size) {
        println("Musica ${1+x}: ${musicas[x]}")
    }
}