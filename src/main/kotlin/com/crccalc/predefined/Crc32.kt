package com.crccalc.predefined

import com.crccalc.AlgorithmParams

/**
 * Created by anthony on 15.05.2017.
 */
object Crc32 {
    val crc32  = AlgorithmParams("CRC-32", 32, 0x04C11DB7L, 0xFFFFFFFFL, true, true, 0xFFFFFFFFL, 0xCBF43926L)
    val bzip2  = AlgorithmParams("CRC-32/BZIP2", 32, 0x04C11DB7L, 0xFFFFFFFFL, false, false, 0xFFFFFFFFL, 0xFC891918L)
    val c      = AlgorithmParams("CRC-32C", 32, 0x1EDC6F41L, 0xFFFFFFFFL, true, true, 0xFFFFFFFFL, 0xE3069283L)
    val d      = AlgorithmParams("CRC-32D", 32, 0xA833982BL, 0xFFFFFFFFL, true, true, 0xFFFFFFFFL, 0x87315576L)
    val jamcrc = AlgorithmParams("CRC-32/JAMCRC", 32, 0x04C11DB7L, 0xFFFFFFFFL, true, true, 0x00000000L, 0x340BC6D9L)
    val mpeg2  = AlgorithmParams("CRC-32/MPEG-2", 32, 0x04C11DB7L, 0xFFFFFFFFL, false, false, 0x00000000L, 0x0376E6E7L)
    val posix  = AlgorithmParams("CRC-32/POSIX", 32, 0x04C11DB7L, 0x00000000L, false, false, 0xFFFFFFFFL, 0x765E7680L)
    val q      = AlgorithmParams("CRC-32Q", 32, 0x814141ABL, 0x00000000L, false, false, 0x00000000L, 0x3010BF7FL)
    val xfer   = AlgorithmParams("CRC-32/XFER", 32, 0x000000AFL, 0x00000000L, false, false, 0x00000000L, 0xBD0BE338L)

    val params = arrayOf(crc32, bzip2, c, d, jamcrc, mpeg2, posix, q, xfer)
}