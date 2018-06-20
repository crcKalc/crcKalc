package com.crckalc

class CrcCalculator(params:AlgorithmParams) {
    private val calculateCrc: Algorithm = if (params.refOut) RefOutAlgorithm(params) else NotRefOutAlgorithm(params)

    fun calculateCrc(data:ByteArray, offset:Int = 0, length:Int = data.size):Long {
        return computeCrc(data, offset, length)
    }

    private fun computeCrc(data:ByteArray, offset:Int, length:Int):Long {
        return calculateCrc.calculateCrc(data, offset, length)
    }

}
