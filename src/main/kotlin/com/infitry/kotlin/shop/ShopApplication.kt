package com.infitry.kotlin.shop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShopApplication

fun main(args: Array<String>) {
	runApplication<ShopApplication>(*args)
}
