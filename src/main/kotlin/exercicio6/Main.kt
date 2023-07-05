package exercicio6

fun main() {
    for (i in 1..9) {
        println("Tabuada do $i:")
        for (j in 1..10) {
            val resultado = i * j
            println("$i x $j = $resultado")
        }
        println()
    }
}