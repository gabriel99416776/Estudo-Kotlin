fun caixaEletronico() {
    var saldo = 1000.0
    println("1 - Ver Saldo")
    println("2 - Sacar")
    println("3 - Depositar")
    println("4 - Sair")
    val opcao = readLine().toString().toInt()
    when (opcao) {
        1 -> {
            println("Seu saldo é: R$ ${saldo}.")
        }

        2 -> {
            print("Qual o valor que deseja sacar ?")
            val saqueValor = readLine().toString().toInt()
            if (saqueValor > saldo) {
                println("Saldo Insuficiente")
            } else {
                var resultadoSaque = saldo - saqueValor
                println("Saldo Restante .: $resultadoSaque")
            }

        }

        3 -> {
            print("Qual o valor que deseja Depositar ?")
            val depositarValor = readLine().toString().toInt()
            var resultadoDeposito = depositarValor + saldo
            println("Saldo Atualizado .: $resultadoDeposito")
        }

        4 -> {
            println("Saindo ...")
            return
        }

        else -> println("Opção inválida")
    }

}

fun main() {
    caixaEletronico()
}