/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Prity
 */
class users {
    private String name,dept;
    int id,credit;
   public users(int id,String name,String dept,int credit)
   {
       this.id=id;
       this.name=name;
       this.dept=dept;
       this.credit=credit;
   }
   public int getid()
   {
       return id;
   }
    public String getname()
   {
       return name;
   }
     public String getdept()
   {
       return dept;
   }
     public int getcredit()
   {
       return credit;
   }

    
}
