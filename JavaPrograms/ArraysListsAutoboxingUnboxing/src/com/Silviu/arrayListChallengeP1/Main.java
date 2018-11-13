package com.Silviu.arrayListChallengeP1;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        Contact silviu = new Contact("Silviu", "0758489687");
        Contact alex = new Contact("Alex", "0752154798");

        mobilePhone.storeNewContact(silviu);
        mobilePhone.storeNewContact(alex);

        mobilePhone.modifyContact(silviu, "Silviut", "0754896548");
        mobilePhone.modifyContact(silviu, "Silviut", "0754896500");

        mobilePhone.printContacts();
    }
}
