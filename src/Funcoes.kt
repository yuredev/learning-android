fun main() {
    println(somar(23.0, 5.0)) // 38
    println(escrever("hello"))
    println(somar10(40.0)) // 50
}

// c é um parametro opcional, caso não seja recebido assume o valor de 10
// obs: devemos definir o tipo do retorno, caso contrário o tipo de retorno será Unit
// que é o equivalente ao retorno void no TypeScript, aqui o comportamento é diferente
// devemos definir o tipo de retorno pois ele não é inferido, a nao ser que seja Unit,
// aí nao é preciso definir o tipo
fun somar(a: Double, b: Double, c: Double=10.0): Double {
    return a + b + c
}

// funcao de linha unica
// no javascript equivale ao
// const escrever = (texto: string) => console.log(texto);
fun escrever(texto: String) = print(texto)

fun somar10(numero: Double) = numero + 10