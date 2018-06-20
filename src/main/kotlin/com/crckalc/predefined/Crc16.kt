package com.crckalc.predefined

import com.crckalc.AlgorithmParams

object Crc16 {
    val ccittFalse = AlgorithmParams("CRC-16/CCITT-FALSE", 16, 0x1021, 0xFFFF, false, false, 0x0000, 0x29B1)
    val arc        = AlgorithmParams("CRC-16/ARC", 16, 0x8005, 0x0000, true, true, 0x0000, 0xBB3D)
    val augCcitt   = AlgorithmParams("CRC-16/AUG-CCITT", 16, 0x1021, 0x1D0F, false, false, 0x0000, 0xE5CC)
    val buypass    = AlgorithmParams("CRC-16/BUYPASS", 16, 0x8005, 0x0000, false, false, 0x0000, 0xFEE8)
    val cdma2000   = AlgorithmParams("CRC-16/CDMA2000", 16, 0xC867, 0xFFFF, false, false, 0x0000, 0x4C06)
    val dds110     = AlgorithmParams("CRC-16/DDS-110", 16, 0x8005, 0x800D, false, false, 0x0000, 0x9ECF)
    val dectR      = AlgorithmParams("CRC-16/DECT-R", 16, 0x0589, 0x0000, false, false, 0x0001, 0x7E)
    val dectX      = AlgorithmParams("CRC-16/DECT-X", 16, 0x0589, 0x0000, false, false, 0x0000, 0x7F)
    val dnp        = AlgorithmParams("CRC-16/DNP", 16, 0x3D65, 0x0000, true, true, 0xFFFF, 0xEA82)
    val en13757    = AlgorithmParams("CRC-16/EN-13757", 16, 0x3D65, 0x0000, false, false, 0xFFFF, 0xC2B7)
    val genibus    = AlgorithmParams("CRC-16/GENIBUS", 16, 0x1021, 0xFFFF, false, false, 0xFFFF, 0xD64E)
    val maxim      = AlgorithmParams("CRC-16/MAXIM", 16, 0x8005, 0x0000, true, true, 0xFFFF, 0x44C2)
    val mcrf4Xx    = AlgorithmParams("CRC-16/MCRF4XX", 16, 0x1021, 0xFFFF, true, true, 0x0000, 0x6F91)
    val riello     = AlgorithmParams("CRC-16/RIELLO", 16, 0x1021, 0xB2AA, true, true, 0x0000, 0x63D0)
    val t10Dif     = AlgorithmParams("CRC-16/T10-DIF", 16, 0x8BB7, 0x0000, false, false, 0x0000, 0xD0DB)
    val teledisk   = AlgorithmParams("CRC-16/TELEDISK", 16, 0xA097, 0x0000, false, false, 0x0000, 0xFB3)
    val tms37157   = AlgorithmParams("CRC-16/TMS37157", 16, 0x1021, 0x89EC, true, true, 0x0000, 0x26B1)
    val usb        = AlgorithmParams("CRC-16/USB", 16, 0x8005, 0xFFFF, true, true, 0xFFFF, 0xB4C8)
    val kermit     = AlgorithmParams("CRC-16/KERMIT", 16, 0x1021, 0x0000, true, true, 0x0000, 0x2189)
    val modbus     = AlgorithmParams("CRC-16/MODBUS", 16, 0x8005, 0xFFFF, true, true, 0x0000, 0x4B37)
    val x25        = AlgorithmParams("CRC-16/X-25", 16, 0x1021, 0xFFFF, true, true, 0xFFFF, 0x906E)
    val xmodem     = AlgorithmParams("CRC-16/XMODEM", 16, 0x1021, 0x0000, false, false, 0x0000, 0x31C3)
    val crcA       = AlgorithmParams("CRC-A", 16, 0x1021, 0xc6c6, true, true, 0x0000, 0xBF05)

    val params = arrayOf(ccittFalse, arc, augCcitt, buypass, cdma2000, dds110, dectR, dectX, dnp, en13757, genibus, maxim, mcrf4Xx, riello, t10Dif, teledisk, tms37157, usb, crcA, kermit, modbus, x25, xmodem)
}