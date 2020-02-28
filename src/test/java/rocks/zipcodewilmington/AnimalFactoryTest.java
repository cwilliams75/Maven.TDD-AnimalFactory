package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreatDog(){
        AnimalFactory factory = new AnimalFactory();
        String referenceTheNameIGaveThisDog = "Bob";
        Date referenceTheDateIGaveThisDog = new Date(2020);
        Dog referenceTheDogThatIJustCreated = factory.createDog(referenceTheNameIGaveThisDog,referenceTheDateIGaveThisDog);
        Assert.assertTrue(referenceTheDogThatIJustCreated instanceof Dog);
    }



}





