package com.app.repository;

import com.app.model.Contact;
import java.util.List;

public interface ContactRepository {
    void add(Contact contact);
    List<Contact> getAll();
    void update(String id, Contact newContactData);
    void delete(String id);
}