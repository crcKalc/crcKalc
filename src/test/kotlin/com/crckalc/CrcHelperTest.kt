package com.crckalc

import kotlin.test.Test
import kotlin.test.assertEquals


class CrcHelperTest {
    @Test
    fun reverseBits() {
        assertEquals(0, CrcHelper.reverseBits(1, 0))//fixme Should it be 0 if valueLength == 0?
        assertEquals(0b0, CrcHelper.reverseBits(0b0, 1))
        assertEquals(0b10, CrcHelper.reverseBits(0b01, 2))
        assertEquals(0b100, CrcHelper.reverseBits(0b001, 3))
        assertEquals(0b000, CrcHelper.reverseBits(0b100, 2))
        assertEquals(0b00001111, CrcHelper.reverseBits(0b11110000, 8))
        assertEquals(0b00000000_00001111, CrcHelper.reverseBits(0b11110000_00000000, 16))
        assertEquals(0b00000000_00000000_00000000_00001111, CrcHelper.reverseBits(0b11110000_00000000_00000000_00000000, 32))
        assertEquals(0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00001111, CrcHelper.reverseBits(0b1111000_00000000_00000000_00000000_00000000_00000000_00000000_00000000 shl 1, 64))
    }

}