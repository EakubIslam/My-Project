/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHOEB AKIB
 */
public class user {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone_no;
    public user(int ID, String FirstName, String LastName, int Age, String Phone_No)
    {
        this.id=ID;
        this.firstName=FirstName;
        this.lastName=LastName;
        this.age=Age;
        this.phone_no=Phone_No;
    }
    public int getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getPhone_No()
    {
        return phone_no;
    }
}
