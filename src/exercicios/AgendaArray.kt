package exercicios

class AgendaArray {
    val pessoas = Array<Pessoa?>(10) { null }
    var tam = 0

    fun armazenarPessoa(p: Pessoa) {
        if (tam < 10) {
            for (i in 0..9) {
                if (pessoas[i] == null) {
                    pessoas[i] = p
                    tam++
                    break
                }
            }
        }
    }

    fun buscarPessoa(nome: String) = pessoas.find { p -> p?.nome == nome }

    fun removerPessoa(nome: String) {
        for (i in 0..9) {
            if (pessoas[i]?.nome == nome) {
                pessoas[i] = null
                tam--
                break
            }
        }
    }

    fun printAgenda() {
        pessoas.forEach { p -> println(p) }
    }

    fun printPessoa(index: Int) {
        println(pessoas[index])
    }
}

fun main() {
    val agenda = AgendaArray()
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
}