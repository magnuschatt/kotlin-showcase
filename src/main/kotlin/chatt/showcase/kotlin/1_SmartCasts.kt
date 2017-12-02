package chatt.showcase.kotlin

fun smartCast1(obj: Any) {

    if (obj is String) {
        println(obj.toLowerCase())  // no need to cast explicitly
    }

}

fun smartCast2(obj: Any) {

    if (obj !is String) return
    println(obj.toLowerCase())

}