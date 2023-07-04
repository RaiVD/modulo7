package exercicio4

fun main() {
    val numeros = IntArray(10)
    val numerosPares = arrayListOf<Int>()

    println("=====Digite 10 numeros inteiros=====")

    for (i in 0 until 10) {
        print("Numero ${i + 1}: ")
        val num = readln().toInt()
        numeros[i] = num

        if (num % 2 == 0) {
            numerosPares.add(num)
        }
    }
    println("Números pares informados:")
    for (numero in numerosPares) {
        println(numero)
    }
}