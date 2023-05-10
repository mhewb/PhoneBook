package io.m2i.PhoneBook.api;

import io.m2i.PhoneBook.api.dto.ContactDTO;
import io.m2i.PhoneBook.entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    ContactDTO toDTO(Contact contact);
    Contact fromDTO(ContactDTO contactDTO);
}