package com.crccalc

/**
 * Parameters for CRC calculation algorithm.
 *
 * @param name   This is a name given to the algorithm. A string value.
 *
 * @param hashSize This is hash size.
 *
 * @param poly   This parameter is the poly. This is a binary value that
 *               should be specified as a hexadecimal number.The top bit of the
 *               poly should be omitted.For example, if the poly is 10110, you
 *               should specify 06. An important aspect of this parameter is that it
 *               represents the unreflected poly; the bottom bit of this parameter
 *               is always the LSB of the divisor during the division regardless of
 *               whether the algorithm being modelled is reflected.
 *
 * @param init   This parameter specifies the initial value of the register
 *               when the algorithm starts.This is the value that is to be assigned
 *               to the register in the direct table algorithm. In the table
 *               algorithm, we may think of the register always commencing with the
 *               value zero, and this value being XORed into the register after the
 *               N'th bit iteration. This parameter should be specified as a
 *               hexadecimal number.
 *
 * @param refIn  This is a boolean parameter. If it is FALSE, input bytes are
 *               processed with bit 7 being treated as the most significant bit
 *               (MSB) and bit 0 being treated as the least significant bit.If this
 *               parameter is FALSE, each byte is reflected before being processed.
 *
 * @param refOut This is a boolean parameter. If it is set to FALSE, the
 *               final value in the register is fed into the XOROUT stage directly,
 *               otherwise, if this parameter is TRUE, the final register value is
 *               reflected first.
 *
 * @param xorOut This is an W-bit value that should be specified as a
 *               hexadecimal number.It is XORed to the final register value (after
 *               the REFOUT) stage before the value is returned as the official
 *               checksum.
 *
 * @param check  This field is not strictly part of the definition, and, in
 *               the event of an inconsistency between this field and the other
 *               field, the other fields take precedence.This field is a check
 *               value that can be used as a weak validator of implementations of
 *               the algorithm.The field contains the checksum obtained when the
 *               ASCII string "123456789" is fed through the specified algorithm
 *               (i.e. 313233... (hexadecimal)).
 */
data class AlgorithmParams(
        val name: String,
        val hashSize: Int,
        val poly: Long,
        val init: Long,
        val refIn: Boolean,
        val refOut: Boolean,
        val xorOut: Long,
        val check: Long = 0x00
) {
    init {
        if (hashSize !in 1..64) {
            throw IllegalArgumentException("Parameter hashSize should be in range 0..64. But it is $hashSize")
        }
    }
}
