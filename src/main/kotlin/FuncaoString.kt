fun main() {
    val str = "Programação Kotlin!"
    println(str[0])
    println(str.length) //Tamanho da string
    println(str.startsWith("Progra")) //Ver se começa com o prefix
    println(str.endsWith("lin!")) //Ver se Termina com o prefix

    println(str.substring(6)) //Começa com o start ate o final
    println(str.substring(6, 8)) //Começa com o start ate a posição 8
    println(str.replace("o", "a")) //Substitui os 'o' pelos 'a'

    println(str.uppercase())  //Tudo letra maiuscula
    println(str.lowercase()) // Tudo letra minuscula
    println(str.contains("Kotlin")) // Verifica se existe a string

    str.isEmpty()

    println("      asdasdasdasdasd        ".trim()) //Exclui os espaços em brancos no começo e no fim


}
