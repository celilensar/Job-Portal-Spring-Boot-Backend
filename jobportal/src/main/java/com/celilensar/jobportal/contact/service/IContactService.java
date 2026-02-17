package com.celilensar.jobportal.contact.service;

import com.celilensar.jobportal.dto.ContactRequestDto;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}
