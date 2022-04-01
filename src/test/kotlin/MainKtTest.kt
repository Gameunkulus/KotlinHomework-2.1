import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {
        val actualLineMaestro: String = "Сумма коммисии: " + CardTransmitCommission(maestro, sumTranscent = 50)
        val expectedLineMaestro = "Сумма коммисии: 23.0"
        assertEquals(actualLineMaestro, expectedLineMaestro)
        val actualLineMasterCard: String = "Сумма коммисии: " + CardTransmitCommission(mastercard, 36000, 50)
        val expectedLineMasterCard = "Сумма коммисии: 0.0"
        assertEquals(actualLineMasterCard, expectedLineMasterCard)
        val actualLineMir: String = "Сумма коммисии: " + CardTransmitCommission(mir, sumTranscent = 50)
        val expectedLineMir = "Сумма коммисии: 35.0"
        assertEquals(actualLineMir, expectedLineMir)
        val actualLineVisa = "Сумма коммисии: " + CardTransmitCommission(visa, 36000, 800)
        val expectedLineVisa = "Сумма коммисии: 600.0"
        assertEquals(actualLineVisa, expectedLineVisa)
        val actualLineVkPay = "Сумма коммисии: " + CardTransmitCommission(previousTranscend = 0, sumTranscent = 800)
        val expectedLineVkPay = "Сумма коммисии: 0.0"
        assertEquals(actualLineVkPay, expectedLineVkPay)

    }

    @Test
    fun getMastercard() {
        val cardType = "Mastercard"
        val previousTranscend = 36000
        val sumTranscent = 50
        val expectedComm = 0.0

        val actualComm: Double = CardTransmitCommission(cardType, previousTranscend, sumTranscent)
        val result = (expectedComm - actualComm) > 0.01

        assertTrue(!result)
    }

    @Test
    fun getMaestro() {
        val cardType = "Maestro"
        val previousTranscend = 0
        val sumTranscent = 50
        val expectedComm = 23.0

        val actualComm: Double = CardTransmitCommission(cardType, previousTranscend, sumTranscent)
        val result = (expectedComm - actualComm) > 0.01

        assertTrue(!result)
    }

    @Test
    fun getVisa() {
        val cardType = "Visa"
        val previousTranscend = 36000
        val sumTranscent = 800
        val expectedComm = 600.0

        val actualComm: Double = CardTransmitCommission(cardType, previousTranscend, sumTranscent)
        val result = (expectedComm - actualComm) > 0.01

        assertTrue(!result)
    }

    @Test
    fun getMir() {
        val cardType = "Мир"
        val previousTranscend = 0
        val sumTranscent = 50
        val expectedComm = 0.0

        val actualComm: Double = CardTransmitCommission(cardType, previousTranscend, sumTranscent)
        val result = (expectedComm - actualComm) > 0.01

        assertTrue(!result)
    }

    @Test
    fun getVkpay() {
        val cardType = "VK Pay"
        val previousTranscend = 0
        val sumTranscent = 800
        val expectedComm = 0.0

        val actualComm: Double = CardTransmitCommission(cardType, previousTranscend, sumTranscent)
        val result = (expectedComm - actualComm) > 0.01

        assertTrue(!result)
    }

    @Test
    fun cardTransmitCommission() {
        val sumTranscent = 800
        val actualSum = CardTransmitCommission(sumTranscent = sumTranscent)
        val expectedSum = 0.0

        val result = (expectedSum - actualSum) > 0.01

        assertTrue(!result)
    }
}