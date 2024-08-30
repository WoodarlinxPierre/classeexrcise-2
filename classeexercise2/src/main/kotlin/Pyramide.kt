package org.example

fun main(args: Array<String>){
   for (arg in args){
       val h : Int = args[0].toInt()
       pyraimes(arg.toInt())
}

}
fun pyraimes (hauteur: Int){
    var nombresetolie: Int = 1
   var  nombreespace : Int = hauteur-1
    var ligne : String = ""
    for (i: Int in 1 ..hauteur){
        ligne = " ".repeat(nombreespace) + "*".repeat(nombresetolie)
        println(ligne)
        nombresetolie+=2
        nombreespace--
    }
}
