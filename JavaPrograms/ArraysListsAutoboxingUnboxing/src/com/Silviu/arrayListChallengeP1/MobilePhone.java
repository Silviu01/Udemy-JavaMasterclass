package com.Silviu.arrayListChallengeP1;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public void storeNewContact(Contact contact){
        boolean exists = this.contactsList.contains(contact.getName());
        if(!exists) {
            this.contactsList.add(contact);
        }
    }

    public void modifyContact(Contact contact, String name, String phoneNumber){
        boolean exists = this.contactsList.contains(contact);
        if(exists){
            int index = contactsList.indexOf(contact);
            Contact contact1 = new Contact(name, phoneNumber);
            this.contactsList.set(index, contact1);
        }
    }

    public void removeContact(Contact contact){
        boolean exists = this.contactsList.contains(contact.getName());
        if(exists) {
            this.contactsList.remove(contact);
        }
    }

    public void query(){

    }

    private int findContact(Contact contact){
        return this.contactsList.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i = 0; i < this.contactsList.size(); i++){
            Contact contact = this.contactsList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }return -1;
    }

    public void printContacts(){
        for (Contact contact : contactsList) {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        }
    }

}
