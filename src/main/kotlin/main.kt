<<<<<<< HEAD
fun main (){
=======
fun main() {
    println("Сумма коммисии: " + CardTransmitCommission(maestro, sumTranscent = 50))
    println("Сумма коммисии: " + CardTransmitCommission(mastercard, 36000, 50))
    println("Сумма коммисии: " + CardTransmitCommission(mir, sumTranscent = 50))
    println("Сумма коммисии: " + CardTransmitCommission(visa, 36000, 800))
    println("Сумма коммисии: " + CardTransmitCommission( previousTranscend = 36000, sumTranscent =  800))
}

val mastercard = "Mastercard"
val maestro = "Maestro"
val visa = "Visa"
val mir = "Мир"
val vkpay = "VK Pay"

fun CardTransmitCommission(cardType: String = "Mastercard", previousTranscend: Int = 0, sumTranscent: Int): Double {
    val kopeyki = sumTranscent * 100
    val commission: Int = when (cardType) {
        mastercard, maestro -> if (previousTranscend > 299 && previousTranscend < 75001) 0 else (kopeyki / 100 * 6) + 2000
        visa, mir -> if ((sumTranscent / 100 * 75) < 35) 3500 else kopeyki / 100 * 75
        else -> 0
    }
    val finalsum: Double = (commission.toDouble()) / 100
    return finalsum
>>>>>>> base/master
}