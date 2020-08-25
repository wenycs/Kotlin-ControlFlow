fun main() {
    println("Expression if")
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "Ofiice close"
    println(office)

    println("")

    println("Expression-ception")
    val jumlah = sum(1,1*4)
    println(jumlah)

    println("")

    println("Statement")
    val value1 = 10
    val value2 = 10
    val tambah = sum(value1, value2)
    println(tambah)
}

fun sum(value1 : Int, value2 : Int) = value1 + value2