package com.example.fragments_upr;

import java.util.ArrayList;

public class ContactsRepository {
    private static ArrayList<Contact> contacts;

    static  {
        contacts = new ArrayList<>();
        contacts.add(new Contact("Jimmy Shanks", "148 East Daviss Avenue, NJ", "https://via.placeholder.com/150.png"));
    }

    public static ArrayList<Contact> getContacts() {
        return contacts;
    }

    public static void setContacts(ArrayList<Contact> contacts) {
        ContactsRepository.contacts = contacts;
    }
}
