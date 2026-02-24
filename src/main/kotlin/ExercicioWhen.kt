fun classificarNota() {
    print("Digite uma nota de 0 a 10 .: ")
    val nota = readLine().toString().toInt()

    when (nota) {
        in 0..4 -> {
            println("Reprovado!")
        }

        in 5..6 -> {
            println("Recuperação!")
        }

        in 7..9 -> {
            println("Aprovado!")
        }

        10 -> {
            println("APROVADO COM EXCELÊNCIA!")
        }
        else -> {
            println("Nota invalida")
        }
    }
}

fun main() {
    classificarNota()
}