package com.infitry.kotlin.shop.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/test")
    fun main(model: Model): String {
        println("javaClass = $javaClass")
        model.addAttribute("title2","test")
        model["title"] = "testTitle"
        return "index"
    }

}