package com.infitry.kotlin.shop.service

import com.infitry.kotlin.shop.dto.ItemDto
import com.infitry.kotlin.shop.repository.ItemRepository
import org.modelmapper.ModelMapper
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.IllegalStateException

@Service
class ItemService(
    private val itemRepository: ItemRepository,
    private val modelMapper: ModelMapper
) {

    fun findAllItems(): List<ItemDto> {
        return itemRepository.findAll().map{ item -> modelMapper.map(item, ItemDto::class.java) }.toList()
    }

    fun findItem(id: Long): ItemDto {
        return modelMapper.map(itemRepository.findByIdOrNull(id) ?: throw IllegalStateException("상품이 없습니다."), ItemDto::class.java)
    }
}