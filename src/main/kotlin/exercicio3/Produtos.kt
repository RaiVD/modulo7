package exercicio3

class Produtos(){
    fun listarProdutos(qantProdutos: Int){
        val listaProduto = DoubleArray(qantProdutos)
        for (i in 0 until listaProduto.size) {
            println("Digite o valor do ${i + 1} produto: ")
            listaProduto[i] = readln().toDouble()
        }
        val somarCompra = listaProduto.sum()
        println("Valor total da compra: R$ $somarCompra")
    }
}