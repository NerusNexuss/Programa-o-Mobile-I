class Musica (val título: String, val artista: String, val ano:Int, var vezesTocadas:Int) {
    val isPopular: Boolean
        get() = vezesTocadas >= 1000
    fun imprimir() {
        println("$título, realizado por $artista, foi lançado em $ano.")
    }
}
fun main(){
    val musica = Musica(título = "enemy", artista = "Imagine Dragons", ano = 2022, vezesTocadas = 100)
    musica.imprimir()
    println(musica.isPopular)
}