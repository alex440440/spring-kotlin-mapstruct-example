package com.skmdemo.mapstruct.domain.entity

class KOrder(var id: Int)

class KUser(var id: Int, var username: String, var address: String) {
    var orders: MutableList<KOrder> = mutableListOf()
}
