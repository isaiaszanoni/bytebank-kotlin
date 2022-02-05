fun main() {
    var conta1 = Conta()
    //conta1.titular = "Pedro"
    println(conta1.titular)

    var contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1234
    contaFran.saldo += 2000.0
    //println("A cliente ${contaFran.titular} possui R$${contaFran.saldo} em saldo.")
    conta1.depositar(contaFran, 50.0)
    println(contaFran.saldo)
}

class Conta(){
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(conta: Conta, valor: Double) {
        conta.saldo += valor
    }
}



