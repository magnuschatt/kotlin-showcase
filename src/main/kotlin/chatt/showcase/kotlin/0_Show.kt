@file:Suppress("UNUSED_PARAMETER", "VARIABLE_WITH_REDUNDANT_INITIALIZER", "UNUSED_VARIABLE", "UNNECESSARY_SAFE_CALL", "UNNECESSARY_NOT_NULL_ASSERTION", "USELESS_ELVIS", "SENSELESS_COMPARISON")

package chatt.showcase.kotlin

fun main(args: Array<String>) {

    val a = 4
    val b = 3
    var str: String? = "the sum of $a and $b is ${a + b}" + " hell".replaceSpaces()
    str = "hey"
    println(str)

    str = getNullableString()!!

    if (str == null) return
    val c = str?.length ?: -1
    val d = str!!.length

    val list: MutableList<String> = ArrayList()
    list.add("hey")
    list.add("bob")
    list.sort()

    val list2 = listOf("hey", "bob")

    frame(400, 300)
    frame(400)
    frame()

    frame(width = 400, height = 300)
    frame(height = 300, width = 400)
}

fun getNullableString(): String? {
    return ""
}

fun sum(a: Int, b: Int) = a + b

fun frame(width: Int = 400, height: Int = 300) {
    val lambda = String::replaceSpaces
}

fun String.replaceSpaces(): String {
    return this.replace(' ', '_')
}

// Collections.sort(list)
// StringUtils.capita
