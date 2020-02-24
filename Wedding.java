/**
 * @author SiHopk
 * Date: 2/5/2020
 * This program will have four separate source codes, the Person class will store information about a person, the Couple
 * class will store information about two people as a couple, the Wedding class will hold information about a couple their 
 * wedding date and location, and finally the TestWedding class which will make objects of each class to make two weddings
 * and then will print the information out for the user to read
 */
package testwedding;
import java.time.*;

public class Wedding {
    private Couple couple;
    private LocalDate weddingDate;
    private String location;//Create our three variables for this class
    
    Wedding(Couple c, LocalDate d, String l){//Our class constructor
        couple = c;
        weddingDate = d;
        location = l; 
    }
    
    public Couple getCouple(){
        return couple;//Returns the couple
    }
    
    public LocalDate getDate(){
        return weddingDate;//Returns the weddingDate
    }
    
    public String getLocation(){
        return location;//Returns the location
    }
    
    public void printWeddingInfo(){
        couple.printCoupleInfo();//Call the printCoupleInfo() method from Couple
        System.out.println(couple.getGroom().getFirstName()+" and "+couple.getBride().getFirstName()+" will be getting married on "+getDate()+" "
                + "and the location will be "+getLocation()+"\n\n");//Print out info of the wedding
    }
}
