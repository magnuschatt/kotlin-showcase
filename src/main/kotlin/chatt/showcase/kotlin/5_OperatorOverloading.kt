@file:Suppress("UNUSED_VARIABLE")
package chatt.showcase.kotlin

fun main(args: Array<String>) {

    val v1 = Vec2(4.0, 7.0)
    val v2 = Vec2(6.0, 23.0)
    val v3 = v1 - v2 + v1

    val dotProduct = v1 dot v2

}

data class Vec2(val x: Double,
                val y: Double) {

    operator fun plus(other: Vec2): Vec2 {
        return Vec2(x + other.x, y + other.y)
    }
}

operator fun Vec2.minus(other: Vec2): Vec2 {
    return Vec2(x - other.x, y - other.y)
}

infix fun Vec2.dot(other: Vec2): Double {
    return x * other.x + y * other.y
}

