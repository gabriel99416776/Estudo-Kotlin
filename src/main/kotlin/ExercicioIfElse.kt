
/** Exercicio 1 **/
fun calculaBonusXpto(cargo: String): Float {
    if (cargo == "Gerente"){
        return 2000F
    }
    if (cargo == "Coordenadores"){
        return 1500F
    }
    if (cargo == "Engenheiros de Software"){
        return 1000F
    }
    if (cargo == "Estagiarios"){
        return 500F
    }

    return 0F
}
/** Exercicio 2 **/

fun calculaBonusTempoXpto(tempo: Int, cargo: String): Float {
    if (cargo == "Gerente" && tempo <= 2){
        return 2000F
    } else{
        return 3000F
    }
    if (cargo == "Coordenadores" && tempo <= 1){
        return 1500F
    } else{
        return 1800F
    }
    if (cargo == "Engenheiros de Software" ){
        return 1000F
    }
    if (cargo == "Estagiarios"){
        return 500F
    }

    return 0F
}

fun main() {
    println(calculaBonusXpto("DASD"))
    println(calculaBonusTempoXpto(2, "Gerente"))
}