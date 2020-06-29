package com.goodsogood.ows

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Log4j2DemoApplication

fun main(args: Array<String>) {
    // System.setProperty("org.springframework.boot.logging.LoggingSystem", LoggingSystem.NONE)
    runApplication<Log4j2DemoApplication>(*args)
}

