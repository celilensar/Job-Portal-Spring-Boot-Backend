package com.celilensar.jobportal.contact.service.Impl;

import com.celilensar.jobportal.contact.service.IContactService;
import com.celilensar.jobportal.dto.ContactRequestDto;
import com.celilensar.jobportal.entity.Contact;
import com.celilensar.jobportal.repository.ContactRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService{

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        boolean result= false;
        Contact contact = contactRepository.save(transformToEntity(contactRequestDto));
        if(contact!=null && contact.getId()!=null){
            result=true;
        }

        return result;
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
//        contact.setCreatedAt(Instant.now());
//        contact.setCreatedBy("System");
        contact.setStatus("NEW");
        return contact;
    }
}
