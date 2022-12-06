package com.infitry.kotlin.shop.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun main(model: Model): String {
        println("welcome!!")
        return "hello"
    }

}