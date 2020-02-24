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

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;//Create our three variables for the Person class
    
    Person(String f, String l, LocalDate d){//Our class constructor
        firstName = f;
        lastName = l;
        birthDate = d;
    }
    
    public String getFirstName(){
        return firstName;//Returns the persons first name
    }
    
    public String getLastName(){
        return lastName;//Returns the persons last name
    }
    
    public LocalDate getBirth(){
     return birthDate;//Returns the persons birthday
    }
}
