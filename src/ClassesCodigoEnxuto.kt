// colocando o val no contrutor nao precisamos fazer as atribuicoes no contrutor
// assim como é no dart
class Anime2(val titulo: String, val anoLancamento: Int) {
    override fun toString() = "{ anime: $titulo, anoLancamento: $anoLancamento }"
}
