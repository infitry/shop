package com.infitry.kotlin.shop.repository

import com.infitry.kotlin.shop.domain.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository: JpaRepository<Item, Long>