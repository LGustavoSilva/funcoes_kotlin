package com.luiz.exerciciofuncoes

class ClassFilterPar {
}

fun main() {
    var mutableList = mutableListOf<Int>()

    for(i in 1..99 step(1)){
        mutableList.add(i)
    }

    var mutableListPar = mutableList.filter{it % 2 == 0}

    println(mutableList)
    println(mutableListPar)
}