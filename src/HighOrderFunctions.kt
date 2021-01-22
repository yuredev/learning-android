import java.util.ArrayList

fun main() {
    fun ehPar(numero: Int) = numero % 2 == 0
//    mandando funcao como parametro
    println(filtrarArray(listOf(2, 4, 7, 1, 8), ::ehPar))
//    funcao lambda anonima
    println(filtrarArray(listOf(2, 4, 7, 1, 8), { numero: Int ->
        val resto = numero % 2
//        a ultima expressão é o retorno
        resto === 1
    }))
}

fun filtrarArray(array: List<Int>, funcaoFiltro: (numero: Int) -> (Boolean)): List<Int> {
    val resultado = ArrayList<Int>()
    for (num in array) {
        if (funcaoFiltro(num)) {
            resultado.add(num)
        }
    }
    return resultado
}
