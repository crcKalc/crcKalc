package com.crckalc

import com.crckalc.predefined.Crc8
import ext.toByteArray
import kotlin.test.Test
import kotlin.test.assertEquals

class Crc8Test {

    @Test fun crc8() {
        val str = "123456789"
        val bytes: ByteArray = str.toByteArray()
        val testBytes = byteArrayOf(49, 50, 51, 52, 53, 54, 55, 56, 57)
//        Crc8.params.forEach {
            assertEquals(Crc8.maxim.check, CrcCalculator(Crc8.maxim).calculateCrc(testBytes))
//            assertEquals(it.check, CrcCalculator(it).calculateCrc(bytes))
//        }
    }

}