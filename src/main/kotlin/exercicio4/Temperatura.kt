package exercicio4

class Temperatura(val tempo: Double) {
    fun validarTemperatura() {
        when {
            tempo <= 18 -> println("O clima está frio")
            tempo in 19.0..23.0 -> println("O clima está agradavel")
            tempo in 23.0..35.0 -> println("O clima está quente.")
            else -> println("O clima está muito quente.")
        }
    }
}