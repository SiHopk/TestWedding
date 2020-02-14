/**
 * @author Simon Hopkins
 * Date: 2/5/2020
 * This program will have four separate source codes, the Person class will store information about a person, the Couple
 * class will store information about two people as a couple, the Wedding class will hold information about a couple their 
 * wedding date and location, and finally the TestWedding class which will make objects of each class to make two weddings
 * and then will print the information out for the user to read
 */
package testwedding;
import java.time.*;

public class TestWedding {

    public static void main(String[] args) {
        Person a = new Person("Simon", "Hopkins", LocalDate.of(1995,6,6));
        Person b = new Person("Random", "Person", LocalDate.of(1994, 5, 5));
        Person c = new Person("Some", "Guy", LocalDate.of(1993, 4, 4));
        Person d = new Person("Another", "Girl", LocalDate.of(1992, 3, 3));//We make 4 people to be Married and give their info to the Person constructor
        
        Couple coup1 = new Couple(a,b);
        Couple coup2 = new Couple(c,d);//We seperate those four into two couples and give their info to the Couple constructor
        
        Wedding wed1 = new Wedding(coup1, LocalDate.of(2022, 7, 7), "Florida");
        Wedding wed2 = new Wedding(coup2 ,LocalDate.of(2023, 8, 8), "Georgia");//We create two weddings with those couples and give their info to the Wedding constructor
        
        wed1.printWeddingInfo();//Print the info for the first wedding
        wed2.printWeddingInfo();//Print the info for the Second wedding by ca
    }

}
    
    
    
