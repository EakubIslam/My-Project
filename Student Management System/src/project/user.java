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
class user {
   private String dept_name,building,budget;
   public user(String dept_name,String building,String budget)
   {
       this.dept_name=dept_name;
       this.building=building;
       this.budget=budget;
   }
   public String getdept_name()
   {
       return dept_name;
   }
    public String getbuilding()
   {
       return building;
   }
     public String getbudget()
   {
       return budget;
   }
}
