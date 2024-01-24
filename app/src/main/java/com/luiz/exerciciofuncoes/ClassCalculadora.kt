package com.luiz.exerciciofuncoes

class ClassCalculadora {
}
fun main() {
    var val1 = 3
    var val2 = 4
    var Mult: (Int, Int) -> Unit = {number1, number2 -> println("Multiplição: $number1 x $number2 = " + number1 * number2)}
    var resultSoma: (Int, Int) -> Unit = {number1, number2 -> println("Passando a fun Soma para fun Calculadora $number1 + $number2 = " + Soma(number1, number2))}
    var resultMult: (Int, Int) -> Unit = {number1, number2 -> println("Passando a fun Mult para fun Calculadora $number1 + $number2 = " + Mult(number1, number2))}

    println("Função soma: " + Soma(val1, val2))
    println(Mult(val1, val2))
    Calculadora(8,2,resultSoma)
    Calculadora(8,2,resultMult)
}

fun Soma(number1: Int, number2: Int): Int{
    return number1 + number2
}

fun Calculadora(number1: Int, number2: Int, operacao: (Int, Int) -> Unit){
    operacao(number1, number2)
}
