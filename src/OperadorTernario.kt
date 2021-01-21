fun main() {
    val idade = 20
//    no Kotlin o operador ternario é o proprio if em uma linha unica
    val anoVacinacao = if (idade > 60) 2021 else 2022
    println(anoVacinacao)
}