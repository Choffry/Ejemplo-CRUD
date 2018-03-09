package com.udemy.services;

import java.util.List;

import com.udemy.entities.ContactEntity;
import com.udemy.models.ContactModel;

public interface ContactService {
	
	public abstract ContactModel addContact(ContactModel contactModel);
	public abstract List<ContactModel> listAllContacts();
	public abstract ContactEntity findContactById(int id);
	public abstract ContactModel findContactByIdModel(int id);
	public abstract void removeContact(int id);
}
