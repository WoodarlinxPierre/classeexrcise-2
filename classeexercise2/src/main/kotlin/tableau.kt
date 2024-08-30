package org.example

import kotlin.random.Random

fun main(){
creeTableauAleatoire(6)
    println(max())
    println(min())
    println(moyenne())
    println(sum())
}
fun creeTableauAleatoire(n: Int): Array<Int> {
    var nombre =  Array<Int>(n){Random.nextInt(0,100)}

return nombre
}
fun max():Int{
    val  n = creeTableauAleatoire(6)
   return n.max()
}
fun min():Int{
    val  n = creeTableauAleatoire(6)
    return n.min()
}
fun moyenne():Int{
    val  n = creeTableauAleatoire(6)
    val mo = n.sum() / n.size
    return  mo
}
fun sum():Int{
    val  n = creeTableauAleatoire(6)

    return  n.sum()
}

