fun main() {
    println("Enum paling mendasar")
    val color : Color = Color.RED
    println(color)

    println("")

    println("Synthetic method enum class")
    val colors: Array<Color> = Color.values()
    colors.forEach { colors ->
        println(colors)
    }

    println("")

    println("Fungsi enumValues")
    val colours: Array<Color> = enumValues()
    colours.forEach { colours ->
        println(colours)
        }

    println("")

    println("Fungsi valueOf")
    val colour: Color = Color.valueOf("RED")
    println("Color is $colour")

    println("")

    println("Properti Ordinal dalam enum class")
    val kolor: Color = Color.GREEN
    println("Position GREEN is ${kolor.ordinal}")

    println("")

    println("When Expression")
    when(kolor){
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
        }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}