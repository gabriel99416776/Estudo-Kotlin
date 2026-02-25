
fun main() {
    /** USANDO LAÇO FOR **/
    /** QUESTAO 1 **/

    for (i in 1..50) {
        print("$i ")
    }
    println()

    /** QUESTAO 2 **/
    for (i in 50 downTo 1) {
        print("$i ")
    }
    println()

    /** QUESTAO 3 **/
    for (i in 1..50) {
        if (i % 5 == 0) {
            print("$i ")
        }
    }
    println()

    /** QUESTAO 4 **/
    var soma = 1
    for (i in 1..500) {
        soma += i
        println("Soma é .: $soma ")
    }
    println()

    /** USANDO WHILE **/
    /** QUESTÃO 1 **/
    var aguaRestante = 2000
    val balao = 7
    var quantidade = 0

    while (aguaRestante >= balao) {
        aguaRestante -= balao
        quantidade++
    }

    println("Enchendo balde a balde...")
    println("Cabem $quantidade baldes")
    println("Sobrou $aguaRestante litros")

    // 2° Maneira
    var capacidadeCaixa = 2000
    var volumeBalao = 7
    var numeroBaloes = 0
    while ((volumeBalao * numeroBaloes) + volumeBalao <= capacidadeCaixa) {
        numeroBaloes++
    }
    println("Cabem $numeroBaloes")
    /** QUESTÃO 2 **/

    var palavra = "Meu nome é Julius"
    var invertido = ""
    var i = palavra.length - 1

    while (i >= 0) {
        invertido += palavra[i]     // ← a letra que está na posição i
        i--
        println(invertido)
    }


    println()

    var indice = 1
    while (indice <= 50) {

        if (indice % 3 == 0 && indice % 5 == 0) {
            print(" FizzBuzz ")
        } else if (indice % 5 == 0) {
            print(" Fizz ")
        } else if (indice % 3 == 0) {
            print(" Buzz ")
        }
        print(" $indice ")
        indice++

    }


}