package Wk10_AbstractClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
        this.contactList = new ArrayList<Contact>();
    }

    public Contact contactSearch(String Lname, String Fname) {
        Contact isFound = null;
        for(Contact c : this.contactList) {
            if(c.getFirstName().equals(Fname) && c.getLastName().equals(Lname)) {
                isFound = c;
            }
        }
        return isFound;
    }

    // think want faster search or add? Search = mostly used so favor search, should be faster
    public boolean add(Contact c) {
        boolean result = false;

        if(!this.contactList.contains(c)) {
            this.contactList.add(c);
            result = true;
        }

        return result;
    }

    public boolean remove(String Lname, String Fname) throws Exception {
        boolean result = false;

        Contact c = contactSearch(Lname,Fname);
        if(c != null)  {
            String response = askInput(String.format("Remove Contact: %s %s? (Yes or No) "
                    ,c.getFirstName(), c.getLastName()));

            if(response.equals("Yes")) {
                this.contactList.remove(c);
                result = true;
            }
        } else {
            // create a specific exception for class exceptions (don't have time now)
                throw new Exception(String.format("%s%s not found in Address book",Fname,Lname));
            }
        return result;
    }

    public int importContacts (AddressBook another) {
        int imported = 0;
        for(int i = 0; i < another.size(); i++) {
            Contact c = another.getContact(i);
            if(!contactList.contains(c)) {
                contactList.add(c);
                imported++;
            }
        }
        return imported;
    }

    // need to create a separate iterator class which AddressBook implements
    // else need to define separate methods
    public boolean updateEmail(String email) {
        boolean result = false;
        for(int i = 0; i < contactList.size(); i++) {
            Contact c = getContact(i);
            if(c.getEmail().equals(email)) {
                String newEmail = askInput(String.format("Enter new email to replace \"%s\": ", email));
                c.setEmail(newEmail);
                result = true;
            }
        }

        return result;
    }


    // Asks user for necessary input as a String
    private String askInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.next();
    }

    // Get contact based on index in Addressbook
    // Helper method for importContacts
    private Contact getContact(int index) {
        return this.contactList.get(index);
    }

    // New size method for AddressBook
    // Helper method for iternation since we're not making a separate class
    private int size() {
        return contactList.size();
    }

    // shouldn't do this but doing it temporarily instead of adding an iterator
    public List<Contact> getContactList() {
        return contactList;
    }

}