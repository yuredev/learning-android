import java.util.ArrayList

fun main() {

    val lista = listOf(2, 4, 7, 1, 8)

    fun ehPar(numero: Int) = numero % 2 == 0
//    mandando funcao como parametro
    println(filtrarArray(lista, ::ehPar))
//    funcao lambda anonima
    println(filtrarArray(lista, { numero: Int ->
        val resto = numero % 2
//        a ultima expressão é o retorno
        resto === 1
    }))
//    tambem é possivel passar o lambda fora dos parenteses
    filtrarArray(lista) {
        numero: Int ->
        numero % 2 == 0
    }
//    o it se refere ao elemento recebido por parametro da lambda
//    deixando ainda mais enxuto
    filtrarArray(lista, {it % 2 == 0})
//    ou ainda melhor...
    filtrarArray(lista) {it % 2 == 0}
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
