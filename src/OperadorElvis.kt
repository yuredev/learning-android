fun main() {
//    o operador elvis é como se fosse o || na atribuição de valores no JavaScript
//    no JavaScript fariamos
//    const value = null;
//    const anotherValue = value || 50;
//    ou seja, se o value for null
//    a variavel anotherValue receberia o 50

//    no Kotlin usamos o operador elvis para isso, desta forma...
    val value: Int? = null
    val anotherValue = value?: 50
    print(anotherValue)
}