package com.crccalc

import com.crccalc.predefined.Crc16
import com.crccalc.predefined.Crc32
import com.crccalc.predefined.Crc64
import com.crccalc.predefined.Crc8
import ext.toByteArray
import kotlin.test.Test
import kotlin.test.assertEquals

class CrcCalculatorTest {
    @Test
    fun calc() {
        assertEquals(0x62, CrcCalculator(Crc8.maxim).calculateCrc(byteArrayOf(0x02, 0x02, 0x02)))
    }

    private val bytes: ByteArray = "123456789".toByteArray()

    @Test fun crc8() {
        Crc8.params.forEach {
            assertEquals(it.check, CrcCalculator(it).calculateCrc(bytes))
        }

    }

    @Test fun crc16() {
        Crc16.params.forEach {
            assertEquals(it.check, CrcCalculator(it).calculateCrc(bytes))
        }
    }

    @Test fun crc32() {
        Crc32.params.forEach {
            assertEquals(it.check, CrcCalculator(it).calculateCrc(bytes))
        }
    }

    @Test fun crc64() {
        Crc64.params.forEach {
            assertEquals(it.check, CrcCalculator(it).calculateCrc(bytes))
        }
    }


}