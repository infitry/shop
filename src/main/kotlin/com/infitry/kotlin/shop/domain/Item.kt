package com.infitry.kotlin.shop.domain

import lombok.AccessLevel
import lombok.Getter
import lombok.experimental.FieldDefaults
import javax.persistence.*

@Entity
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;

    @Column
    val name: String = "";
}