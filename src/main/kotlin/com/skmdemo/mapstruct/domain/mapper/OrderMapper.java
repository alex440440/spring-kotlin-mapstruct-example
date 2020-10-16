package com.skmdemo.mapstruct.domain.mapper;

import com.skmdemo.mapstruct.domain.dto.OrderDto;
import com.skmdemo.mapstruct.domain.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "id")
    OrderDto toDto(Order order);
}
