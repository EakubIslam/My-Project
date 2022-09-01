
public class Room {
    private int number;
    private String type;
    private String phone_no;
    private String reserve;

    public Room(int ID, String FirstName, String LastName, String Phone_No)
    {
        this.number=ID;
        this.type=FirstName;
        this.phone_no=LastName;
        this.reserve=Phone_No;
    }
    public int getNumber()
    {
        return number;
    }
    public String getType()
    {
        return type;
    }
    public String getReserve()
    {
        return reserve;
    }
    public String getPhone_No()
    {
        return phone_no;
    }

}
