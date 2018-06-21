package com.crccalc.predefined

import com.crccalc.AlgorithmParams

/**
 * Predefined params for 8-bit algorithms.
 */
@Suppress("MemberVisibilityCanBePrivate")
object Crc8 {
    val crc8     = AlgorithmParams("CRC-8",          8, 0x07, 0x00, false, false, 0x00, 0xF4)
    val cdma2000 = AlgorithmParams("CRC-8/CDMA2000", 8, 0x9B, 0xFF, false, false, 0x00, 0xDA)
    val darc     = AlgorithmParams("CRC-8/DARC",     8, 0x39, 0x00, true,  true,  0x00, 0x15)
    val dvbS2    = AlgorithmParams("CRC-8/DVB-S2",   8, 0xD5, 0x00, false, false, 0x00, 0xBC)
    val ebu      = AlgorithmParams("CRC-8/EBU",      8, 0x1D, 0xFF, true,  true,  0x00, 0x97)
    val iCode    = AlgorithmParams("CRC-8/I-CODE",   8, 0x1D, 0xFD, false, false, 0x00, 0x7E)
    val itu      = AlgorithmParams("CRC-8/ITU",      8, 0x07, 0x00, false, false, 0x55, 0xA1)
    val maxim    = AlgorithmParams("CRC-8/MAXIM",    8, 0x31, 0x00, true,  true,  0x00, 0xA1)
    val rohc     = AlgorithmParams("CRC-8/ROHC",     8, 0x07, 0xFF, true,  true,  0x00, 0xD0)
    val wcdma    = AlgorithmParams("CRC-8/WCDMA",    8, 0x9B, 0x00, true,  true,  0x00, 0x25)

    val params = arrayOf(crc8, cdma2000, darc, dvbS2, ebu, iCode, itu, maxim, rohc, wcdma)
}
