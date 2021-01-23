package exercicios

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

open class Pessoa(val nome: String, val altura: Double) {
    private var dataNascimento: LocalDate? = null
    private var idade: Int? = null

    constructor(nome: String, altura: Double, dataNascimento: LocalDate): this(nome, altura) {
        this.dataNascimento = dataNascimento
        this.setIdade(calcIdade())
    }

    fun getIdade() = this.idade

    private fun setIdade(idade: Int) {
        this.idade = idade
    }

    fun calcIdade(): Int = ChronoUnit.YEARS.between(
        dataNascimento,
        LocalDate.now()
    ).toInt()

    override fun toString() = "$nome ($dataNascimento/$altura)"
}

fun main() {
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val nascimento = LocalDate.parse("26-05-2002", formatter)
    val pessoa = Pessoa("Yure", 2.02, nascimento)
    println(pessoa.getIdade())
}