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
class object {
     private String name;
    int id;
    float tgpa;
   public object(int id,String name,float tgpa)
   {
       this.id=id;
       this.name=name;
      
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
     public Float tgpa()
   {
       return tgpa;
   }
}
