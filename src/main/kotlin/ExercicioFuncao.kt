/** Exercicio 1 **/

fun ano(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos ano(s) corresponde(m) a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

/** Exercicio 2 **/
fun nome(n: String) = println("Olá, $n!".length)

/** Exercicio 3 **/
fun cubo(n: Int) = println(n * n * n)

/** Exercicio 4 **/
fun milhas(m: Int) = println(m * 1.6)

/** Exercicio 5 **/
fun celsuiu(c: Int) = println((c * 9/5) + 32)

/** Exercicio 6**/
fun str(nome: String) {
    println(nome.replace("a", "x"))
    println(nome.replace("A", "x"))
    println(nome.lowercase())
}


fun main() {
    ano(5)
    nome("Gabriel")
    cubo(5)
    milhas(1)
    celsuiu(5)
    str("GabrielA")
}