fun main() {
    /** DESAFIO 1**/

    for (i in 1..10) {
        println("i.: $i")
    }
    println()

    /** DESAFIO 2 **/

    for (i in 0..20 step 2) {
        println("Pares.: $i")
    }
    println()

    /** DESAFIO 3 **/

    for (i in 10 downTo 0) {
        println("Contagem Regressiva.: $i")
    }
    println()

    /** DESAFIO 4 **/


    val numero = 5

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
    println()

    /** DESAFIO 5 **/

    var soma = 0

    for (i in 1 .. 100) {
        soma += i
        println("Soma.: $soma")
    }

}