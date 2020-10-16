package com.skmdemo.mapstruct.domain.mapper;

import com.skmdemo.mapstruct.domain.dto.UserDto;
import com.skmdemo.mapstruct.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { OrderMapper.class })
public interface UserMapper {
    UserDto toDto(User user);
}
