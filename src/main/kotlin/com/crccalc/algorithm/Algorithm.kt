package com.crccalc.algorithm

import com.crccalc.AlgorithmParams

abstract class Algorithm(val params: AlgorithmParams) {

    private val lastBit = (1L shl (params.hashSize - 1))

    protected val table = LongArray(256)
    protected val mask: Long = with(params) { if (hashSize < 64) (1L shl hashSize) - 1 else -0x1L }

    init {
        createTable()
    }

    abstract fun calculateCrc(data: ByteArray, offset: Int, length: Int): Long

    private fun createTable() {
        for (i in table.indices) {
            table[i] = createTableEntry(i)
        }
    }

    private fun createTableEntry(index: Int): Long {
        with (params) {
            var row = when {
                refIn -> index.reverseBits(hashSize)
                hashSize > 8 -> index.toLong() shl (hashSize - 8)
                else -> index.toLong()
            }

            for (i in 0..7) {
                row = if ((row and lastBit) != 0L) {
                    ((row shl 1) xor poly)
                } else {
                    row shl 1
                }
            }

            if (refOut) {
                row = CrcHelper.reverseBits(row, hashSize)
            }

            return row and mask
        }
    }

}