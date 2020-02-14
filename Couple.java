/**
 * @author Simon Hopkins
 * Date: 2/5/2020
 * This program will have four separate source codes, the Person class will store information about a person, the Couple
 * class will store information about two people as a couple, the Wedding class will hold information about a couple their 
 * wedding date and location, and finally the TestWedding class which will make objects of each class to make two weddings
 * and then will print the information out for the user to read
 */
package testwedding;

public class Couple {
   private Person groom;
   private Person bride;//Create our two Person objects for the couple class
   
    Couple(Person g, Person b){//Our class constructor
       groom = g;
       bride = b;
   }
   
   public Person getGroom(){
       return groom;//Returns the groom object
   }
   
   public Person getBride(){
       return bride;//Returns the bride object
   }
   
   public void printCoupleInfo(){
       System.out.println("The groom is "+groom.getFirstName()+" "+groom.getLastName()+" who was born "+groom.getBirth()+"\n");//Prints out the grooms information
       System.out.println("The bride is "+bride.getFirstName()+" "+bride.getLastName()+" who was born "+bride.getBirth()+"\n");//prints out the brides information
   }
}
