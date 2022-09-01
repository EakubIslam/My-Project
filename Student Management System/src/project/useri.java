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
class useri {
    private String name,dept;
    int id,salary;
   public useri(int id,String name,String dept,int salary)
   {
       this.id=id;
       this.name=name;
       this.dept=dept;
       this.salary=salary;
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
     public int getsalary()
   {
       return salary;
   }

}
