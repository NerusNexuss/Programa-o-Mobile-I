fun main(){
    println("Digite um número:")
    val numero = readLine()!!.toInt()

    for (i in 1..10){
        println("$numero x $i = ${numero * i}")
    }
}