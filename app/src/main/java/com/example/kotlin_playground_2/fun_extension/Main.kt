package com.example.kotlin_playground_2.fun_extension

fun main() {
    "This is very long string".isGreaterThan(5).also { println(it) }
    "This is another very long string".isGreaterThan2().also { println(it) }

    B("This is very long string too").isGreaterThan3(50).also { println(it) }

    B("This is also another very very long string").isGreaterThan4(50).also { println(it) }

}

fun String.isGreaterThan(n: Int = 10) = length > n
fun String.isGreaterThan2(n: Int = 10) = this@isGreaterThan2.isGreaterThan(n)

interface A {
    fun isGreaterThan(n: Int): Boolean
}

class B(private val str: String): A {
    override fun isGreaterThan(n: Int) = str.length > n
}

fun A.isGreaterThan3(n: Int = 10) = isGreaterThan(n)

fun A.isGreaterThan4(n: Int = 10) = object : A {
    override fun isGreaterThan(n: Int) = this@isGreaterThan4.isGreaterThan(n)
}.isGreaterThan(n)





