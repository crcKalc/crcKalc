package com.crccalc.algorithm

import com.crccalc.AlgorithmParams
import ext.xor
import kotlin.math.max

class NotRefOutAlgorithm(params: AlgorithmParams) : Algorithm(params) {
    private val toRight = max(params.hashSize - 8, 0)

    override fun calculateCrc(data: ByteArray, offset: Int, length: Int): Long {
        with(params) {
            var crc = init

            for (i in offset until offset + length) {
                val tableIndex = (((crc shr toRight) xor data[i]) and 0xFF).toInt()
                crc = table[tableIndex] xor (crc shl 8)
                crc = crc and mask
            }

            return (crc xor xorOut) and mask
        }
    }
}