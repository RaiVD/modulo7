package exercicio8

fun main() {
    var entrada = false

    while (!entrada) {
        print("Digite um valor: ")
        val valor = readLine()?.toIntOrNull()

        when(valor != null && valor >= 0){
            true -> {
                var fibA = 0
                var fibB = 1

                for (i in 2..valor) {
                    val fibAuxiliar = fibA + fibB
                    fibA = fibB
                    fibB = fibAuxiliar
                }
                println("Fib($valor) = $fibB")
                entrada =true
            }
            false -> println("Por favor, digite um número inteiro não negativo!")

        }

    }
}
