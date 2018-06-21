package com.crccalc

import com.crccalc.algorithm.Algorithm
import com.crccalc.algorithm.AlgorithmFactory
import com.crccalc.algorithm.NotRefOutAlgorithm
import com.crccalc.algorithm.RefOutAlgorithm

actual class CrcCalculator actual constructor(params: AlgorithmParams) {
    private val calculateCrc: Algorithm = AlgorithmFactory.algorithmFor(params)

    actual fun calculateCrc(data: ByteArray, offset: Int, length: Int): Long {
        return calculateCrc.calculateCrc(data, offset, length)
    }
}