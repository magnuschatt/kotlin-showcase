package chatt.showcase.kotlin

fun smartCast1(obj: Any) {

    if (obj is String) {
        println(obj.toLowerCase())
    }

}

fun smartCast2(obj: Any) {

    if (obj !is String) return
    println(obj.toLowerCase())

}