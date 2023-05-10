package io.m2i.PhoneBook.api;

import io.m2i.PhoneBook.api.dto.UserDTO;
import io.m2i.PhoneBook.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "user.contactList", target = "contactDTOs")
    UserDTO toDTO(User user);
    @Mapping(source = "userDTO.contactDTOs", target = "contactList")
    User fromDTO(UserDTO userDTO);

}