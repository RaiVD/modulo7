package exercicio11

class Acrescimo (val valor: Double, val pocentegem: Double){

    fun calcularValor():Double{
        val porcentagemDoProduto = valor * (pocentegem / 100)
        val valorFinalDoProduto = porcentagemDoProduto + valor
        return valorFinalDoProduto
    }

}