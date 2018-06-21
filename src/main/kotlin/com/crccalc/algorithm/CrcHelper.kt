package com.crccalc.algorithm

object CrcHelper {

    /**
     * Revers last valueLength bits in value.
     *
     * For example:
     * 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1111 is a binary representation of 15 (64 bit as it is Long)
     * 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1111 0000 reversed 8bit value
     * 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1111 0000 0000 0000 result 16 bit value
     * 0000 0000 0000 0000 0000 0000 0000 0000 1111 0000 0000 0000 0000 0000 0000 0000 result 32 bit value
     * 1111 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 result 64 bit value
     * That's why we have second argument that specify value length.
     *
     * @param value - value to be reversed
     * @param valueLength - amount of bits to be reversed. Higher bits are reset to zeros.
     */
    fun reverseBits(value: Long, valueLength: Int): Long {
        var ul = value
        var newValue: Long = 0

        for (i in valueLength - 1 downTo 0) {
            newValue = newValue or (ul and 1 shl i)
            ul = ul shr 1
        }

        return newValue
    }

}

fun Long.reverseBits(length: Int): Long = CrcHelper.reverseBits(this, length)

fun Int.reverseBits(length: Int): Long = CrcHelper.reverseBits(this.toLong(), length)
