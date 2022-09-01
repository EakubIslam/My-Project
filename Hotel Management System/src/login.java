/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHOEB AKIB
 */
public class login {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String phone_no;
    private String email;
    private String pasw;
    private String address;
    public login(int ID,String Username, String FirstName, String LastName, int Age, String Phone_No, String Email,String Add)
    {
        this.id=ID;
        this.username=Username;
        this.firstName=FirstName;
        this.lastName=LastName;
        this.age=Age;
        this.phone_no=Phone_No;
        this.email=Email;
        this.address=Add;
    }
    public int getId()
    {
        return id;
    }
    public String getUsername()
    {
        return username;
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
    public String getEmail()
    {
        return email;
    }
    public String getPass()
    {
        return pasw;
    }
    public String getAddress()
    {
        return address;
    }
}
