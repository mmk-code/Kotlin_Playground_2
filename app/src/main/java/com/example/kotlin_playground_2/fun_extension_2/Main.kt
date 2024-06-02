package com.example.kotlin_playground_2.fun_extension_2

import kotlin.reflect.KParameter
import kotlin.reflect.KProperty

fun main() {
    val a = A()
    a.aExt()
}

class A

fun doA(a: A) {
    println("doA fun called on a-object of class A")
}

fun A.aExt() {
    // Extension function pass this as argument or parameter to function body
    var thisRef = this
    thisRef = this@aExt // Both this and this@aExt refer to same receiver object
    doA(thisRef)
}

