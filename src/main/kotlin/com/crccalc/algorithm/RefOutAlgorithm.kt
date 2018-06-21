package com.crccalc.algorithm

import com.crccalc.AlgorithmParams
import ext.xor

class RefOutAlgorithm(params: AlgorithmParams) : Algorithm(params) {

    override fun calculateCrc(data: ByteArray, offset: Int, length: Int): Long {
        with(params) {
            var crc = init.reverseBits(hashSize)

            for (i in offset until offset + length) {
                val tableIndex = ((crc xor data[i]) and 0xFF).toInt()
                crc = table[tableIndex] xor (crc ushr 8)
                crc = crc and mask
            }

            return (crc xor xorOut) and mask
        }
    }
}