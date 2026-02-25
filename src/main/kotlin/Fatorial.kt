fun main() {
    print("Digite o numero para fatorar: ")
    val n = readLine()!!.toInt()

    var fatorial = 1.toLong()
    var i = n

    while (i >= 1){
        fatorial *= i
        i--
    }

    println("Fatorial de $n é $fatorial")
}