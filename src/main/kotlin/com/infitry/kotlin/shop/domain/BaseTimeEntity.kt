package com.infitry.kotlin.shop.domain

import lombok.AccessLevel
import lombok.Getter
import lombok.experimental.FieldDefaults
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass


@Getter
@MappedSuperclass
@EntityListeners
@FieldDefaults(level = AccessLevel.PRIVATE)
class BaseTimeEntity {

    @LastModifiedDate
    @Column(name = "update_at", nullable = false)
    val updateAt: LocalDateTime? = null

    @CreatedDate
    @Column(name = "create_at", nullable = false)
    val createAt: LocalDateTime? = null
}