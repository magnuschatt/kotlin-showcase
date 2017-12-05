@file:Suppress("UNUSED_VARIABLE")
package chatt.showcase.kotlin

data class KotlinUser(var name: String,
                      var age: Int,
                      var email: String)


fun main(args: Array<String>) {

    val javaUser = JavaUser("Magnus", 27, "magnus@gmail.com")
    val kotlinUser = KotlinUser("Magnus", 27, "magnus@gmail.com")

    val (name, age, email) = getUser()
    val (code, msg) = getResult()
}

fun getUser(): KotlinUser {
    return KotlinUser("Magnus", 27, "magnus@gmail.com")
}

fun getResult(): Pair<Int, String> {
    return Pair(404, "Not Found")
}