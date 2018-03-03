package com.ir.controller;


import com.google.common.collect.Lists;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contacts/")
public class ContactController {
    private static final List<Contact> contacts = Lists.newArrayList(
            new Contact("Bruno Krebs"), new Contact("John")
    );

    @GetMapping
    @PreAuthorize("hasAuthority('read:contacts')")
    public List<Contact> getContacts() {
        return contacts;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('add:contacts')")
    public void addContact(@RequestBody Contact contact) {
        contacts.add(contact);
    }
}

class Contact {
    String name;

    Contact(String name){
        name = this.name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}