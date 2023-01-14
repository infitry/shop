package com.infitry.kotlin.shop.domain

import javax.persistence.*

@Entity
@Table(name = "TB_ITEM")
class Item (name: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @Column
    var name: String = name
}