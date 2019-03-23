package com.veinhorn.mapstruct.domain.mapper;

import com.veinhorn.mapstruct.domain.dto.OrderDto;
import com.veinhorn.mapstruct.domain.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "id")
    OrderDto toDto(Order order);
}
