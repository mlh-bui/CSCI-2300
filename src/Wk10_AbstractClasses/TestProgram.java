package Wk10_AbstractClasses;

// Test for AddressBook and Contact Classes
public class TestProgram {
    public static void main(String[] args) throws Exception {
        Contact c1 = new FriendsContact("Marissa","Bui","45678","gmail.com");
        Contact c2 = new BusinessContact("Joe","Gold","123456","yahoo");
        Contact c3 = new BusinessContact("Lucy","Owens","50344848484","slu.edu");
        Contact c4 = new BusinessContact("Bob","Duncan","4567","slu.edu");

        AddressBook a = new AddressBook();
        a.add(c1);
        a.add(c2);

        System.out.println(a.contactSearch("Bui", "Marissa").toString());
        a.updateEmail("yahoo");
        System.out.println(a.contactSearch("Gold","Joe").toString());

        AddressBook b = new AddressBook();
        b.add(c3);
        b.add(c4);

        System.out.println(a.importContacts(b)); // test importContacts()

        a.remove("Gold","Joe"); // test remove()

        for(Contact c : a.getContactList()) {
            System.out.println(c.toString());
        }

    }
}
