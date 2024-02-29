package org.example

class Test(var name: String) {
    init {
        println("Hallo $name")
    }
    fun printName() {
        println(name)
    }
}


fun main() {
    val a = Test("Sten");
    a.name = "Peter"
    a.printName()
    println("Hello World!")
}