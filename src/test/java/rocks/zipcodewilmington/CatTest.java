package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void catNameTest() {
        Date date = new Date(1999);
        Cat testCat = new Cat("Corey", date, 420);
        testCat.setName("Dude");

        String expected = "Dude";
        String actual = testCat.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setBirthDateTest() {
        Date date = new Date(1999);
        Cat testCat = new Cat("Corey", date, 420);
        Date testDate = new Date(2019);
        testCat.setBirthDate(testDate);

        Date expected = testDate;
        Date actual = testCat.getBirthDate();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void speakTest() {
        Date date = new Date(1999);
        Cat testCat = new Cat("Corey", date, 420);

        String expected = "meow!";
        String actual = testCat.speak();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void eatTest() {
        Date date = new Date(1999);
        Cat testCat = new Cat("Corey", date, 420);

        Food goldFish = new Food();
        testCat.eat(goldFish);

        Integer expected = 1;
        Integer actual = testCat.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getIdTest() {
        Date date = new Date(1999);
        Cat testCat = new Cat("Corey", date, 420);

        Integer expected =  420;
        Integer actual = testCat.getId();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void animalInheritanceTest(){
        Cat testCat = new Cat(null, null, null);
        Assert.assertEquals(true, testCat instanceof Animal);
    }
    @Test
    public void mammalInheritanceTest(){
        Cat testCat = new Cat(null, null, null);
        Assert.assertEquals(true, testCat instanceof Mammal);

    }

}
