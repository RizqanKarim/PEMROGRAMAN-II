package com.app.repository;

import com.app.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class InMemoryContactRepository implements ContactRepository {
    private List<Contact> contactList = new ArrayList<>();

    @Override
    public void add(Contact contact) {
        contactList.add(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactList;
    }

    @Override
    public void update(String id, Contact newContactData) {
        for (Contact c : contactList) {
            if (c.getId().equals(id)) {
                c.setName(newContactData.getName());
                c.setPhoneNumber(newContactData.getPhoneNumber());
                c.setEmail(newContactData.getEmail());
                break;
            }
        }
    }

    @Override
    public void delete(String id) {
        contactList.removeIf(c -> c.getId().equals(id));
    }
}