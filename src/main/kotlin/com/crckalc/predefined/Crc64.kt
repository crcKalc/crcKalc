package com.crckalc.predefined

import com.crckalc.AlgorithmParams

object Crc64 {
    val crc64 = AlgorithmParams("CRC-64", 64, 0x42F0E1EBA9EA3693L, 0x00000000L, false, false, 0x00000000L, 0x6C40DF5F0B497347L)
    val we    = AlgorithmParams("CRC-64/WE", 64, 0x42F0E1EBA9EA3693L, -0x0000001L, false, false, -0x1L, 0x62EC59E3F1A4F00AL)
    val xz    = AlgorithmParams("CRC-64/XZ", 64, 0x42F0E1EBA9EA3693L, -0x0000001L, true, true, -0x1L, -0x66a2364420e6c606L)

    val params = arrayOf(crc64, we, xz)
}
