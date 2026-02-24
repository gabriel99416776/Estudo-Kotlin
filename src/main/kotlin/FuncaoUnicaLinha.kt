
/** Pode atribuir = a função**/

fun helloWorld(nome: String) = println("Olá, $nome!")

//fun media(n1: Int, n2: Int): Int{
//    val media = (n1 + n2) / 2
//    return media
//}

fun media(n1: Int, n2: Int): Int = (n1 + n2) / 2
fun soma(n1: Int, n2: Int) = n1 + n2




fun main() {

    helloWorld("Gabriel")
    println(media(10, 5))
    println(soma(10, 5))

}