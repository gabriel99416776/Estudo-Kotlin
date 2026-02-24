fun maiorDeIdade(idade: Int) = (idade >= 18)

//    return (idade >= 18)

//    if (idade >= 18) {
//        return true
//    } else{
//        return false
//    }

// informatica - 500
// geografia - 600

fun mensalidadeCurso(curso: String): Double{
    var mensalidade = 0.0


    if (curso == "informatica"){
        mensalidade = 500.0
    } else if (curso == "geografia") {
        mensalidade = 600.0
    }
    return mensalidade
}

fun main() {
    println(mensalidadeCurso("direito"))
}