/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
class Siswa
class DataSiswa(val Nilai: Int, var Nama: String)

fun main() {
    val Adi = Siswa()
    
    val tentangAdi = DataSiswa(85, "Adi")
    println("Nilai :" + tentangAdi.Nilai)
    println("Nama Siswa :" + tentangAdi.Nama)
}