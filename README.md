# crcKalc
Kotlin Multiplatform implementation for CRC calculator

# Usage
```Kotlin
fun main(args: Array<String>){
    val bytes = "123456789".toByteArray(java.nio.charset.Charset.forName("ASCII"))
    val params = com.crccalc.predefined.Crc8.maxim
    val crc = com.crccalc.CrcCalculator(params).calculateCrc(bytes)
    val resultHex = crc.toString(16).toUpperCase()
    val expectHex = params.check.toString(16).toUpperCase()
    println("crc for ${bytes.contentToString()} is 0x$resultHex and should be 0x$expectHex")
}
```
