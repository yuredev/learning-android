import kotlin.math.pow

fun main() {
//    passando fora de ordem
    println(calcDelta(b = 50.0, c=11.0, a=22.0))
    println(calcDelta(c=11.0))
    println(calcDelta(null, null, 10.1))
}

fun calcDelta(a: Double? = 21.4, b: Double? = 31.0, c: Double? = 1.2): Double? {
    // detalhe: todo Double ou Int ou Boolean são objetos, portanto eles possuem metodos
    // a baixo é usado o metodo de potenciacao que esta na classe Double
    if (a == null || b == null || c == null) {
        return null
    }
    return b.pow(2) - 4 * a * c
}