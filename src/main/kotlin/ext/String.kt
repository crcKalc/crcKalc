package ext

fun String.toByteArray(): ByteArray {
    return ByteArray(this.length){
        this[it].toByte()
    }
}