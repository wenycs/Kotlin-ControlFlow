fun main() {
    println("Dasar")
    val value1 = 7
    when(value1){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }

    println("")

    println("Penggunaan branch else")
    val value2 = 20
    when(value2){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    println("")

    println("bukti else hanya dieksekusi jika tidak ada yang memenuhi")
    val value3 = 7
    val stringOfValue = when(value3){
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)

    println("")

    println("Curly braces dalam when")
    val value4 = 7
    val StringOfValue = when(value4){
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
    println(StringOfValue)

    println("")

    println("Command is")
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    println("")

    println("Mengecek range")
    val value5 = 27
    val ranges = 10..50
    when(value5){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}