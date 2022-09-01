/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHOEB AKIB
 */
public class Reserve {
    private int reserve_id;
    private int client_id ;
    private int room_no;
    public Reserve(int ID, int FirstName, int LastName)
    {
        this.reserve_id=ID;
        this.client_id=FirstName;
        this.room_no=LastName;
    }
    public int getId()
    {
        return reserve_id;
    }
    public int getFirstName()
    {
        return client_id;
    }
    public int getLastName()
    {
        return room_no;
    }
    
}
