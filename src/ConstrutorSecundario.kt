class Anime3 (val titulo: String, val anoLancamento: Int) {
    var categoria: String? = null
    constructor(titulo: String, anoLancamento: Int, categoria: String): this(titulo, anoLancamento) {
        this.categoria = categoria
    }
    override fun toString() = "{ titulo: $titulo, anoLancamento: $anoLancamento, categoria: $categoria }"
}

fun main() {
    val animeExcelente = Anime3("One Piece", 1999)
    println(animeExcelente)
    val animeBom = Anime3("Tokyo Ghoul", anoLancamento = 2011, "terror")
    println(animeBom)
}