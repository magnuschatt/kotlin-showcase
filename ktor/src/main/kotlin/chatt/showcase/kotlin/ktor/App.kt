package chatt.showcase.kotlin.ktor

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.routing

@Suppress("unused")
fun Application.main() {

    routing {
        get("/hello") {
            call.respondText("Hello, World ahahahaha")
        }

        get("/bye") {
            call.respondText("bye xxxxxs")
        }
    }
}