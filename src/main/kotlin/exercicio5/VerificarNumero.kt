package exercicio5

class VerificarNumero(val valor: Double) {
    fun verificar(){
        if (valor<0){
            println("O número que você digitou é negativo")
        }
        else{
            println("O número que você digitou é positivo")
        }
    }
}