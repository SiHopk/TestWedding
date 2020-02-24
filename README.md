# TestWedding
This is a small program project made for my first java class. It uses four seperate source codes, Person, Couple, Wedding, And TestWedding, to set up a couples' wedding. The Person class stores information on a persons' first name, last name, and birthday inside of a Person object. The Couple class will take two Person objects and store them as the bride and groom inside of one Couple object. The Wedding class stores a Couple object, their wedding date, and their wedding location under one Wedding object. Finally TestWedding creates all of the objects for each class and runs the program to get results.

## Classes
Below will be each class as well as a table for each listing its methods and describing what those methods do.

### Person
This class is made up of the String variable firstName, the string variable lastName, and the LocalDate variable birthDate.


| Method | Description |
|:---:|:---:|
| Person() | This is the class constructor, it will give our three variables their values by taking infromation when a Person object is created |
| getFirstName() | This method will return the firstName variable |
| getLastName() | This method will return the lastName variable |
| getBirth() | This method will return the birthDate variable |

### Couple
This class is made up of two Person variables bride and groom.

| Method | Description |
|:---:|:---:|
| Couple() | This is the class constructor, it will give our two variables their values by taking infromation when a Couple object is created |
| getGroom() | This method will return the groom variable |
| getLastName() | This method will return the bride variable |
| printCoupleInfo() | This method will print out information on each person in the couple by calling the getFirstName(), getLastName(), and getBirth() methods from the Person class|

### Wedding
This class is made of a Couple object names couple, a LocslDate variable called weddingDate, and a String called location.

| Method | Description |
|:---:|:---:|
| Wedding() | This is the class constructor, it will give the three variables their values by taking infromation when a Wedding object is created |
| getCouple() | This method returns the couple object |
| getDate() | This method returns the weddingDate variable |
| getLocation | This method returns the location variable |
| printWeddingInfo() | this method will call the printgCoupleInfo() method to print each peron in the couples information, then it will use the getGroom().getFirstName(), getBride.getFirstName(), getDate(), and getLocation() methods to print their names again and the information about the wedding|

### TestWedding
This class has only one method, that beingthe main() method. When the program is run this method creates four Person objects, then splits them into two different Couple objects, then it uses each couple to make two Wedding objects, then finally it will call the printWeddingInfo() method from the Wedding class for each of the weddings and prints out their information.
