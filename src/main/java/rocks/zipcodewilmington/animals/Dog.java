package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {

    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }
    //Dog(){} <-Constructor

    //speak(){} <-Method

    //anything(){} <-Method

    //anything(String whatImCallingIt) <-Method with parameters

    //String steelers = "Big Ben"; <-M

    //anything(steelers)



    public String speak() {
        return "bark!";
    }

}
