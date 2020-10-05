/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var jumlahPizza = 0
    
    while (jumlahPizza < 10) {
        println("Saya telah memakan " + jumlahPizza + " Pizza")
        jumlahPizza++
    }
    
    do {
        println("Tersisa " + jumlahPizza + " Pizza")
        jumlahPizza--
    } while (jumlahPizza >= 0)
}