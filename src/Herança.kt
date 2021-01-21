// toda classe no Kotlin não pode ser herdada, para
// abrirmos para herança precisamos colocar o open
open class Vehiculo(val ano: Int, val nome: String) {
//    para permitir um método a ser sobrecarregado colocamos o open
    open fun acelerar() = println("Acelerando veiculo de nome $nome")
}

class Carro(ano: Int, nome: String): Vehiculo(ano, nome) {
    override fun acelerar() = println("Acelerando com o carro $nome")
}