package exercicio5

fun main() {
    println("Digite quantos itens ira adicionar na lista: ")
    val valor = readln().toInt()

    val listaDeCompras = Array(valor){""}

    var i=0
    while (i < valor) {
        println("Produto ${i+1}: ")
        listaDeCompras[i] = readln()
        i++
    }
    println("==========Lista de Compras==========")
    for (x in 0 until   listaDeCompras.size) {
        println("Produto ${x + 1}: ${listaDeCompras[x]}")
    }
}

