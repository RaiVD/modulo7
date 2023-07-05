package exercicio6

fun main() {
    println("\n****** Tabuada ******\n")
    for (i in 1..9) {
        println("======================")
        println("\tTabuada do $i:")

        for (x in 1..10) {
            val resultado = i * x
            println("\t $i x $x = $resultado")
        }

    }
}