package com.infitry.kotlin.shop.dto

import lombok.AccessLevel
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import lombok.ToString
import lombok.experimental.FieldDefaults

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class ItemDto {
    var id: Long = 0
    var name: String = ""
}