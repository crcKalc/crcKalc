package ext

/** Performs a bitwise XOR operation between the two values. */
inline infix fun Byte.shl(other: Byte): Byte = (this.toInt() shl other.toInt()).toByte()
inline infix fun Long.xor(other: Byte): Long = this xor other.toLong()