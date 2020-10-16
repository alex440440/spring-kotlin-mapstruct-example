package com.skmdemo.mapstruct.domain.dto

class KOrderDto(var id: Int=0)

class KUserDto(var id: Int=0, var username: String?=null, var address: String?=null) {
    var orders: MutableList<KOrderDto> = mutableListOf()
}
