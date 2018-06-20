package com.crckalc

import com.crckalc.predefined.Crc8
import kotlin.test.Test
import kotlin.test.assertEquals

class CrcCalculatorTest {
    @Test
    fun calc() {
        assertEquals(0x62, CrcCalculator(Crc8.maxim).calculateCrc(byteArrayOf(0x02, 0x02, 0x02)))
    }
}