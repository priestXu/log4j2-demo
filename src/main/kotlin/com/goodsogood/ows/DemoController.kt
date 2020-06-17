package com.goodsogood.ows

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author xuliduo
 * @date 2020/6/17
 * @description class DemoController
 */
@RestController
@CrossOrigin(origins = ["*"], maxAge = 3600)
class DemoController {
    var log: Logger = LoggerFactory.getLogger(DemoController::class.java)

    @GetMapping("/log-demo")
    fun log() {
        log.info("test info")
        log.debug("test debug")
        log.error("test error")
        log.warn("test warn")
    }
}