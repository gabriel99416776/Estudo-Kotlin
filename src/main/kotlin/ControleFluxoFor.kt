fun main() {

    for (i in 0..20 step 5) {
        print("$i ")
    }
    println()

//    downTo é onde o numero vai ate outro menor

    for (i in 20 downTo 0 step 5) {
        print("$i ")
    }
    println()

    for (i in 0..20) {
//        if (i == 5) {
//            //break // Termina um laço de repetição
//            continue // Para quando for igual a condição e continua para o proximo Ex .: 1 2 3 4 [5 pula] 6
//        }
        for (j in 0..5) {
            if (j == 1){
                break
            }
        }
        println()
        print("$i ")
    }


//    val str = "Programação Kotlin"
//    for (j in str) {
//        print(j)
//    }
}