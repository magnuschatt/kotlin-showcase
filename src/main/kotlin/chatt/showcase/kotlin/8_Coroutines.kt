package chatt.showcase.kotlin

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureNanoTime

fun main(args: Array<String>) = runBlocking {

    val count = 1_000_000
    val inData = (1..count).map { it.toLong() }

    val time = measureNanoTime {

        val outData = inData
                .map { async { process(it) } }
                .map { it.await() }

        println("${inData[count - 1]} -> ${outData[count - 1]}")
    }

    // if executed sequentially it would take over 27 hours
    println("Seconds elapsed: ${time/1_000_000_000.0}")
}


suspend fun process(input: Long): Long {
    delay(100)
    return input * input - input
}

