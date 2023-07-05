package exercicio11

class Acrescimo (val valor: Double, val pocentegem: Double){

    fun calcularValor(){
        val porcentagemDoProduto = valor * (pocentegem / 100)
        val valorFinalDoProduto = porcentagemDoProduto + valor
        val formatoProdutoFinal = "%.2f".format(valorFinalDoProduto)

        println("O valor de venda do produto é: R$ $formatoProdutoFinal")
    }

}