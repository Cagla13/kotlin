var bakiye: Double = 2500.0

fun main() {
    println(" BANKA  \n")

    bakiyeGoster()
    paraYatir(500.0)
    paraCek(200.0)
    paraGonder("Cagla Kandemir", "TR34 0001", 300.0)
    bagisYap(2, 100.0)
    hesapOzeti()

    println("tamamlandı")
}

fun bakiyeGoster() {
    println("bakıyen: $bakiye TL")
}

fun paraYatir(miktar: Double) {
    bakiye += miktar
    println("$miktar TL yatirildi. bakıye: $bakiye TL")
}

fun paraCek(miktar: Double) {
    if (miktar <= bakiye) {
        bakiye -= miktar
        println("$miktar TL gıttı. kalan: $bakiye TL")
    } else {
        println("bakıye yetersız!")
    }
}

fun paraGonder(isim: String, iban: String, miktar: Double) {
    if (miktar <= bakiye) {
        bakiye -= miktar
        println("aktarıldı: $isim ($iban) - $miktar TL gonderildi.")
    } else {
        println("basarisiz: yetersiz bakiye.")
    }
}

fun bagisYap(vakifNo: Int, miktar: Double) {
    if (miktar <= bakiye) {
        val vakif = when(vakifNo) {
            1 -> "Organ Vakfi"
            2 -> "Losev"
            3 -> "Darussafaka"
            else -> "Diger"
        }
        bakiye -= miktar
        println("Bagis: $vakif kurumuna $miktar TL yapildi.")
    }
}

fun hesapOzeti() {
    println("\n HESAP OZETI ")
    println(" Bakiye: $bakiye TL")
    println("Durum: " + if (bakiye < 1000) "Dusun" else "Iyi")
}