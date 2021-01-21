// construtor na linha da definicao da classe
// parametros vao pro init
class Anime(titulo: String, anoLancamento: Int) {
//    definindo atributos
    val titulo: String
    val anoLancamento: Int
//    aqui vai o método do construtor
//    os parametros dele são os de cima
//    onde esta a definicao da classe
    init {
        this.titulo = titulo
        this.anoLancamento = anoLancamento
    }

//    sobrescrevendo métodos
    override fun toString(): String {
       return "{ anime: $titulo, anoLancamento: $anoLancamento }"
    }
}