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
class userr {

    private String name,dept;
    int id;
    float cgpa,tgpa;
   public userr(int id,String name,String dept,float cgpa,float tgpa)
   {
       this.id=id;
       this.name=name;
       this.dept=dept;
       this.cgpa=cgpa;
       this.tgpa=tgpa;
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
     public float getcgpa()
   {
       return cgpa;
   }
 public float gettgpa()
   {
       return tgpa;
   }
    
}
