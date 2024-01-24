package com.luiz.exerciciofuncoes

class ClassConcat {
}

fun main() {
    var listaString = listOf("Luiz", "Maria", "José", "João")

    listaString.map { "Olá $it" }.forEach { println(it) }
}