package com.crccalc

import com.crccalc.algorithm.Algorithm
import com.crccalc.algorithm.NotRefOutAlgorithm
import com.crccalc.algorithm.RefOutAlgorithm

expect class CrcCalculator(params: AlgorithmParams) {
    fun calculateCrc(data: ByteArray, offset: Int = 0, length: Int = data.size): Long
//    private val calculateCrc: Algorithm = if (params.refOut) RefOutAlgorithm(params) else NotRefOutAlgorithm(params)
//
//    fun calculateCrc(data: ByteArray, offset: Int = 0, length: Int = data.size): Long {
//        return computeCrc(data, offset, length)
//    }
//
//    private fun computeCrc(data: ByteArray, offset: Int, length: Int): Long {
//        return calculateCrc.calculateCrc(data, offset, length)
//    }
}
