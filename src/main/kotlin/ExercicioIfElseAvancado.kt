/** Exercicio 1 (Quadrado)**/
fun formaGeometrica(n1: Float, n2: Float) {
    if (n1 == n2) {
        println("Forma um quadrado!")
    } else {
        println("É outra forma geométrica!")
    }
}

/** Exercicio 2 (Trinagulo) **/
fun lerTriangulo(n1: Float, n2: Float, n3: Float) {
    if (n1 == n2 && n1 == n3) {
        println("Forma um Triangulo Equilatero!")
    } else {
        println("É um triangulo!")
    }
}

/** Exercicio 3 (Qual a saida) **/
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira String")
        } else {
            println("Segunda String")
        }
        println("Terceira String")
    }
}

/** Exercicio 4 ( Portaria) **/
fun portaria(){
    print("Informe sua idade .:")
    var idade = readLine().toString().trim()

    if (idade.toInt() >= 18) {
        println("Acesso Permitido")


        print("Qual o tipo de convite .:")
        var tipoConvite = readLine().toString().trim()
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            println("Convite Aceito")
        } else {
            println("Negado. Convite Invalido")

        }

        print("Qual o codigo do Convite .:")
        var codigoPremium = "XL"
        var codigoComum = "XT"
        var codigoConvite = readLine().toString().trim()
        if (codigoConvite == codigoPremium || codigoConvite == codigoComum) {
            println("Convite Aceito")
        } else {
            println("Negado. Convite Invalido")
        }

    } else {
        println("Acesso Negado")
    }

}


fun main() {
    formaGeometrica(1F, 3F)
    lerTriangulo(3F, 3F, 3F)
    qualASaida(0)
    portaria()
}