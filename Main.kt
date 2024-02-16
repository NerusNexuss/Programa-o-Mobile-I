package com.example.myapplication

val doce: () -> Unit = {
    println("Tenha um doce!")
}

val travessura: () -> Unit = {
    println("Travessura!")
}

fun doceOuTravessura(isTravessura: Boolean):() -> Unit {
    return if(isTravessura)
        travessura
    else
        doce
}

fun main() {
    val funcaoTravessura = doceOuTravessura(true)
    funcaoTravessura()
}