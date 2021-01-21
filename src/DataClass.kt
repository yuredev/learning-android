// maneira enxuta de criar classes que servem como modelos

data class Animal(val nomeCientifico: String, val filo: String)

// declarando atributos que nao vem pelo construtor
data class Vehiculo2(val nome: String) {
    var velocidade = 0
}