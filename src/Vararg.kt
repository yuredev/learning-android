fun main() {
    printNames("Eren", "Erwin", "Armin", "Mikasa", "Reiner", "Historia")
}

// recebe um array de names
// funciona como o ...names no javascript
fun printNames(vararg names: String) {
    for (name: String in names) {
        println(name)
    }
}