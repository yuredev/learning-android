package exercicios

class AgendaList {
    private val pessoas =  ArrayList<Pessoa>()

    fun armazenarPessoa(p: Pessoa) {
        if (pessoas.size < 10) {
            pessoas.add(p)
        }
    }

    fun buscarPessoa(nome: String) = pessoas.find { p -> p.nome == nome }

    fun removerPessoa(nome: String) {
        pessoas.remove(this.buscarPessoa(nome))
    }

    fun printAgenda() {
        pessoas.forEach { p -> println(p) }
    }

    fun printPessoa(index: Int) {
        println(pessoas[index])
    }
}

fun main() {
    val agenda = AgendaList()
    agenda.armazenarPessoa(Pessoa("Eren", 1.7))
    agenda.armazenarPessoa(Pessoa("Armin", 1.6))
    agenda.armazenarPessoa(Pessoa("Mikasa", 1.6))
    agenda.armazenarPessoa(Pessoa("Erwin", 1.8))
    agenda.armazenarPessoa(Pessoa("Levi", 1.6))
    agenda.printAgenda()
    println("-----------------------------------")
    agenda.removerPessoa("Eren")
    agenda.printAgenda()
    println("-----------------------------------")
    agenda.removerPessoa("Mikasa")
    agenda.armazenarPessoa(Pessoa("Reiner", 1.6))
    agenda.armazenarPessoa(Pessoa("Sasha", 1.6))
    agenda.printAgenda()
    println("-----------------------------------")
    println(agenda.buscarPessoa("Sasha"))
    agenda.printPessoa(3)
}