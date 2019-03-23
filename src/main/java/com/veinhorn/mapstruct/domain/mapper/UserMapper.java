package com.veinhorn.mapstruct.domain.mapper;

import com.veinhorn.mapstruct.domain.dto.UserDto;
import com.veinhorn.mapstruct.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { OrderMapper.class })
public interface UserMapper {
    UserDto toDto(User user);
}
