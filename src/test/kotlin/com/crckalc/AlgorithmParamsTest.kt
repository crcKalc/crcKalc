package com.crckalc

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AlgorithmParamsTest{

    @Test
    fun zeroHashSizeAlgorithmParamsShouldThrowException(){
        assertFailsWith(IllegalArgumentException::class) {
            AlgorithmParams("", 0, 0xff, 0, false, false, 0, 0)
        }
    }

    @Test
    fun negativeHashSizeAlgorithmParamsShouldThrowException(){
        assertFailsWith(IllegalArgumentException::class) {
            AlgorithmParams("", -10, 0xff, 0, false, false, 0, 0)
        }
    }

    @Test
    fun tooBigHashSizeAlgorithmParamsShouldThrowException(){
        assertFailsWith(IllegalArgumentException::class) {
            AlgorithmParams("", 68, 0xff, 0, false, false, 0, 0)
        }
    }
}