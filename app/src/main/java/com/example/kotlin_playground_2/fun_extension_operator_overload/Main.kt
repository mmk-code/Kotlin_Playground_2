package com.example.kotlin_playground_2.fun_extension_operator_overload

import java.time.LocalDate
import kotlin.math.pow

class A {
    override fun toString(): String = "Object of type class A"
}
fun main() {
    demo1()

    //===========================================
    demo2()

    //===========================================

    demo3()

    //===========================================

    demo4()

    //===========================================

    demo5()
}

fun demo1() {
    val today = LocalDate.parse("2024-06-03")

    operator fun LocalDate.component1() = year
    operator fun LocalDate.component2() = monthValue
    operator fun LocalDate.component3() = dayOfMonth


    val (year, month, day) = today

    println("Year = $year, Month = $month, Day = $day")
}

fun demo2() {
    operator fun Any?.invoke() {
        println(this)
    }

    "Hello World"()
    123()
    val a=A()
    a()
    null()
}

fun demo3() {
    operator fun Int.invoke(other: Int) = this * other

    val result = 5(2+3)

    println(result)
}

fun demo4() {
    val number = 786

    operator fun Int.get(digit: Int) = div(10.0.pow(digit.toDouble())).rem(10.0).toInt()

    println(number[0])
    println(number[1])
    println(number[2])
    println(number[3])
}

fun demo5() {
    operator fun Int.Companion.get(vararg items: Int): IntArray = intArrayOf(*items)
    operator fun Int.Companion.invoke(vararg items: Int): IntArray = intArrayOf(*items)

    val evenNumber = Int[2, 4, 6, 8, 10]
    val oddNumber = Int(3, 5, 7,  )
    evenNumber.forEach ( ::println )
    oddNumber.forEach (::println)

}
