package com.crccalc.algorithm

import com.crccalc.AlgorithmParams

object AlgorithmFactory {
    fun algorithmFor(params: AlgorithmParams) = if (params.refOut) RefOutAlgorithm(params) else NotRefOutAlgorithm(params)
}