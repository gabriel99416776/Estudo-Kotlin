fun main() {
    val numero = 5

    when (numero) {
        1 -> {
            println("Valor é 1")
        }
        in 2 .. 9 -> {
            println("Valor está entre 2 e 9")
        }
        else -> {
            
        }
    }
}