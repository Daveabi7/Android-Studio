fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    println("Результати обчислень:")
    println("1) (a + b - c) * 2 / 3 % 5 = ${expression1()}")
    println("2) (x > y) && (z > x) || (y > z) = ${expression2()}")
    println("3) (a + b > c) && ((a - b) < c) = ${expression3()}")
    println("4) ((a + b) - c) * d / 2 + 10 % 3 - (c and d) = ${expression4()}")
    println("5) ((a - b) * c) / d + 15 % 4 - (c or d) = ${expression5()}")
}

fun expression1(): Int {
    val a = 10; val b = 20; val c = 5
    return (a + b - c) * 2 / 3 % 5
}

fun expression2(): Boolean {
    val x = 30; val y = 40; val z = 50
    return (x > y) && (z > x) || (y > z)
}

fun expression3(): Boolean {
    val a = 10; val b = 5; val c = 20
    return (a + b > c) && ((a - b) < c)
}

fun expression4(): Int {
    val a = 5; val b = 3; val c = 2; val d = 4
    return ((a + b) - c) * d / 2 + 10 % 3 - (c and d)
}

fun expression5(): Int {
    val a = 10; val b = 2; val c = 5; val d = 3
    return ((a - b) * c) / d + 15 % 4 - (c or d)
}