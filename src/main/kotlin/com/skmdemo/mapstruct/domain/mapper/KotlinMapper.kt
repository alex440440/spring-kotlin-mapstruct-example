package com.skmdemo.mapstruct.domain.mapper

import com.skmdemo.mapstruct.domain.dto.KOrderDto
import com.skmdemo.mapstruct.domain.dto.KUserDto
import com.skmdemo.mapstruct.domain.entity.KOrder
import com.skmdemo.mapstruct.domain.entity.KUser
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface KOrderMapper {
    @Mapping(target = "id")
    fun toDto(order: KOrder): KOrderDto
}

@Mapper(componentModel = "spring", uses = [KOrderMapper::class])
interface KUserMapper {
    fun toDto(user: KUser): KUserDto
}


