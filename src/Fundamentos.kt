import java.lang.ClassCastException

fun main() {
    val name = "Yure"
//     concatenação
    println("My name is $name and my name have ${name.length} letters")

//     CAST INSEGURO
//     joga uma ClassCastException caso não seja possivel considerar
//    o valor como uma string
    try {
        println(5032 as String)
    } catch (error: ClassCastException) {
        println(error)
    }
//    CAST SEGURO
    val variable = 50
//    dá nulo caso a conversão não seja possível
    println(variable as? String)

//    o tipo any é tipo dynamic do dart
    var a: Any
    a = 50
    println(a)
    a = "yure"
    println(a)

//    o código abaixo não é permitido, assim como no TypeScript
//    uma variável do tipo String não pode receber null
//    val value: String = null

//    para atribuir null em uma variável tipada devemos colocar o ? na declaração
    val value: String? = null
    println("value = $value")

}