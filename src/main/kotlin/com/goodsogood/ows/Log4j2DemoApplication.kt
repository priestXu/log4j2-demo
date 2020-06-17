package com.goodsogood.ows

import com.aliyun.openservices.shade.com.alibaba.rocketmq.client.log.ClientLogger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.logging.LoggingSystem
import org.springframework.boot.runApplication

@SpringBootApplication
class Log4j2DemoApplication

fun main(args: Array<String>) {
    System.setProperty("org.springframework.boot.logging.LoggingSystem", LoggingSystem.NONE)
    System.setProperty(ClientLogger.CLIENT_LOG_LEVEL, "ERROR")
    runApplication<Log4j2DemoApplication>(*args)
}

