package com.example.kotlin_playground_2.lembdas

/*
Equivalence Between Functions A.(B)->C With and Without Receiver (A, B)->C
A.()->C is equivalent to (A)->C. ex. Int.()->Int is equivalent to (Int)->Int
 */
fun main() {

    val plusReceiver: Int.(Int) -> Int = { this + it }
    val plusNorm: (Int, Int) -> Int = { it, other -> it + other }

    val plusA: (Int, Int) -> Int = plusReceiver // Works
    val plusB: Int.(Int) -> Int  = plusNorm // Also works

    val plusCast1: Int.(Int) -> Int = (fun(a: Int, b: Int) = a + b) as Int.(Int) -> Int
    val plusCast2: (Int, Int) -> Int = (fun Int.(b: Int) = this + b) as (Int, Int) -> Int
}