package com.crckalc

abstract class Algorithm(private val params: AlgorithmParams) {
    private val lastBit = 1L shl (params.hashSize - 1)

    protected val table: LongArray = createTable()
    protected val mask: Long = if (params.hashSize < 64) (1L shl params.hashSize) - 1 else -0x1L

    private fun createTable(): LongArray {
        val rez = LongArray(256)
        for (i in rez.indices) {
            rez[i] = createTableEntry(i.toLong())
        }
        return rez
    }

    private fun createTableEntry(index: Long): Long {
        with(params) {
            var row = when {
                refIn -> CrcHelper.reverseBits(index, hashSize)
                hashSize > 8 -> index shl (hashSize - 8)
                else -> index
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

    abstract fun calculateCrc(data: ByteArray, offset: Int, length: Int): Long

}