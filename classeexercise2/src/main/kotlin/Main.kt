package org.example

import java.sql.DriverManager.println

fun main() {
    println("Hello World!")
    val a = 1                                   // type est            int
    val aa = 1L                                 // type est  long
    val aaa = a * 25 + aa * 100                 // type est  long
    val b = 1.0                                 // type est   double
    val c = "1"                                 // type est string
    val d = true                                // type est bool
    val laChose = c + b                         // type est string
    val k = listOf("1", "2", "3")               // type est list of string
    val l = mutableListOf(true, false, true)    // type est  liste de boolean  que tu peux manier comme tu veux
}