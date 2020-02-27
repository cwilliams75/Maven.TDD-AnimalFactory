package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void constructorNewDog(){
        //Given
        String expectedName = "Skip";
        Date expectedDate = new Date();
        Integer expectedId = 25;

        Dog skip = new Dog(expectedName,expectedDate,expectedId);

        //When
        String actualName = skip.getName();
        Date actualDate = skip.getBirthDate();
        Integer actualId = skip.getId();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void speakTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        // When (a dog's name is set to the given name)
        String actual = dog.speak();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        Date expected = new Date(2020);
        Dog dog = new Dog(null, expected, null);

        //When
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        //Given
        Dog dog = new Dog(null, null, null);
        Food steak = new Food();
        dog.eat(steak);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest(){
        // Given
        Integer expected = 25;
        Dog dog = new Dog(null, null, 25);

        //When
        Integer actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dogInstanceOfAnimal(){
        Dog dog = new Dog(null, null, 25);
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void dogInstanceOfMammal(){
        Dog dog = new Dog(null, null, 25);
        Assert.assertTrue(dog instanceof Mammal);
    }

}
