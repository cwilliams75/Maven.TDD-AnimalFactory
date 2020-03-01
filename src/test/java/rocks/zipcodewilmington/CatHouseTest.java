package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.stream.IntStream;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

//    Cat testCat;

//    @Before
//    public void setUp(){
//        testCat = new Cat("tom", null, 25);
//        CatHouse.add(testCat);
//    }

    @Test
    public void addTest(){
        Cat testCat = new Cat("tom",null, 25);
        CatHouse.add(testCat);
        Cat expected = testCat;
        Cat actual = CatHouse.getCatById(25);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void addTestError(){
        Cat testCat = new Cat("tom",null, 25);
        CatHouse.add(testCat);
        Cat expected = testCat;
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        Cat testCat = new Cat("tom",null, 25);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        Cat expected = null;
        Cat actual = CatHouse.getCatById(25);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeCatById(){
        Cat testCat = new Cat("tom", null, 25);
        CatHouse.add(testCat);
        CatHouse.remove(25);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCatByIdTest(){
        Cat testCat = new Cat("tom", null, 25);
        CatHouse.add(testCat);
        int expected = testCat.getId();
        int actual = CatHouse.getCatById(25).getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Cat testCat = new Cat("tom", null, 25);
        IntStream.range(0,10).forEach( i-> CatHouse.add(testCat));
        int expected = 10;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }



}
