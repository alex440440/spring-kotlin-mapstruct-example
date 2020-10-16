package com.skmdemo.mapstruct.service

import com.skmdemo.mapstruct.domain.dto.KUserDto
import com.skmdemo.mapstruct.domain.entity.KOrder
import com.skmdemo.mapstruct.domain.entity.KUser
import com.skmdemo.mapstruct.domain.mapper.KUserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KUserService (
       @Autowired val mapper: KUserMapper
){
    fun get(): KUserDto {
        return mapper.toDto(createUser())
    }

    private fun createUser(): KUser {
        val user = KUser(1, "David", "Minsk")
        user.orders = createOrders()
        return user
    }

    private fun createOrders(): MutableList<KOrder> {
        return mutableListOf(
                KOrder(1), KOrder(2)
        )
    }
}
