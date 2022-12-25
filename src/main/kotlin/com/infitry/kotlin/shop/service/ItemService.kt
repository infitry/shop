package com.infitry.kotlin.shop.service

import com.infitry.kotlin.shop.domain.Item
import com.infitry.kotlin.shop.dto.ItemDto
import com.infitry.kotlin.shop.repository.ItemRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class ItemService(
    private val itemRepository: ItemRepository,
    private val modelMapper: ModelMapper
) {

    fun findAllItems(): List<ItemDto> {
        return itemRepository.findAll().map {item -> modelMapper.map(item, ItemDto::class.java) }.toList()
    }
}