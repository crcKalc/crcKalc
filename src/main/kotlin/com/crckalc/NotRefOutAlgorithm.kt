package com.crckalc

import kotlin.math.max

/**
 * Implements CRC calculation for not reflected out algorithm.
 */
class NotRefOutAlgorithm(private val params: AlgorithmParams): Algorithm(params) {
    private val toRight = max(params.hashSize - 8, 0)

    override fun calculateCrc(data:ByteArray, offset:Int, length:Int):Long {
        var crc = params.init

        for (i in offset until offset + length) {
            val tableIndex = (((crc shr toRight) xor data[i].toLong()) and 0xFF).toInt()
            crc = (table[tableIndex] xor (crc shl 8))
            crc = crc and mask
        }

        return (crc xor params.xorOut) and mask
    }
}