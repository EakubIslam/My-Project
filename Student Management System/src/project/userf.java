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
class userf {
    private String name;
    int id,saving;
   public userf(int id,String name,int saving)
   {
       this.id=id;
       this.name=name;
       this.saving=saving;
       
   }
   public int getid()
   {
       return id;
   }
    public String getname()
   {
       return name;
   }
     public int getsaving()
   {
       return saving;
   } 
}
