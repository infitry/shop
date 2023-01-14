package com.infitry.kotlin.shop.service

import com.infitry.kotlin.shop.domain.Item
import com.infitry.kotlin.shop.repository.ItemRepository
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test

@SpringBootTest
internal class ItemServiceTest @Autowired constructor(
    private val itemService: ItemService,
    private val itemRepository: ItemRepository
) {
    @Test
    fun 전체상품_조회() {
        // given
        var item = Item("상품1")
        var item2 = Item("상품2")
        itemRepository.save(item)
        itemRepository.save(item2)
        // when
        val itemSize = itemService.findAllItems().size
        // then
        assertEquals(itemSize, 2, "상품의 개수가 일치하여야 한다.")
    }

    @Test
    fun 단일상품_조회() {
        // given
        var item = Item("상품1")
        var item2 = Item("상품2")
        itemRepository.save(item)
        itemRepository.save(item2)
        // when
        val myItem = itemService.findItem(1)
        // then
        assertEquals(myItem.name, "상품1", "조회 된 상품의 상품 명이 일치하여야 한다.")
    }
}