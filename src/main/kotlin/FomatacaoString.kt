import java.util.Locale

fun main() {

    val nome = "Gabriel"
    println("Olá, $nome")


    println("olá, %s".format(nome)) // Placeholder (está reservando o lugar)

    //%s - String
    //%d - Int
    //%f - Ponto Flutuante
    //%c - Char
    //%b - Boolean


    val value = 5
    val salario = 16855.95

    println("Valor: %d - Salario: %f".format(value, salario))

    println("Valor: %02d - Salario: %.2f".format(value, salario))

    println("Valor: %02d - Salario: %.2f".format(Locale.US,value, salario))




}