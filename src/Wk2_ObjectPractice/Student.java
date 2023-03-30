package Wk2_ObjectPractice;
// Module 2x1
// COMP 313 - Marissa Bui

public class Student {
    /**
     * Declaration of Instance variables
     * Wk2_ObjectPractice.Student name, address, & email
     */
    private String name;
    private String address;
    private String email;

    /**
     * Main constructor for a student
     *
     * @param name
     * @param address
     * @param email
     */
    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Student(String name) {
        this.name = name;
    }

    /**
     * Getter & Setter methods
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

} // class Wk2_ObjectPractice.Student
