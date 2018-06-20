package com.crckalc

object CrcHelper {

    /**
     * Revers last valueLength bits in value.
     *
     * For example decimal 15 is                            0000 0000 0000 0000 0000 0000 0000 1111 binary value (64 bit as it is Long)
     * But if you work with 8bit values reversed should be  0000 0000 0000 0000 0000 0000 1111 0000
     * In case of 32 bit values result should be            0000 0000 0000 0000 1111 0000 0000 0000
     * And in case 64 bit values result should be           1111 0000 0000 0000 0000 0000 0000 0000
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
