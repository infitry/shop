package com.infitry.kotlin.shop.controller

import com.infitry.kotlin.shop.dto.ItemDto
import com.infitry.kotlin.shop.service.ItemService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(value = ["/items"])
@RestController
class ItemController(
    private val itemService: ItemService
) {

    @GetMapping
    fun items(): ResponseEntity<List<ItemDto>> {
        val itemList: List<ItemDto> = itemService.findAllItems()
        return ResponseEntity.ok(itemList)
    }

    @GetMapping("/{itemId}")
    fun items(@PathVariable itemId: Long): ResponseEntity<ItemDto> {
        return ResponseEntity.ok(itemService.findItem(itemId))
    }
}