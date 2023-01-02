package com.infitry.kotlin.shop.domain

import lombok.AccessLevel
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import lombok.experimental.FieldDefaults
import javax.persistence.*

@Entity
@Table(name = "TB_ITEM")
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,

    @Column
    private var name: String
)