package com.crckalc

class RefOutAlgorithm(private val params: AlgorithmParams): Algorithm(params) {
    override fun calculateCrc(data:ByteArray, offset:Int, length:Int):Long {
        var crc = CrcHelper.reverseBits(params.init, params.hashSize)

        for (i in offset until offset + length) {
            crc = table[((crc xor data[i].toLong()) and 0xFF).toInt()] xor (crc.ushr(8))
            crc = crc and mask
        }

        return (crc xor params.xorOut) and mask
    }
}