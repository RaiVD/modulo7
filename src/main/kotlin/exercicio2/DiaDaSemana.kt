package exercicio2

class DiaDaSemana(val dia : Int) {
    fun diaDaSemana(){
        when (dia){
            1 -> println("Domingo")
            2 -> println("Segunda - feira")
            3 -> println("Terça - feira")
            4 -> println("Quarta - feira")
            5 -> println("Quinta - feira")
            6 -> println("Sexta - feira")
            7 -> println("Sabado")
            else -> println("Numero invalido, por favor digite um numero de 1 a 7")
        }
    }
}