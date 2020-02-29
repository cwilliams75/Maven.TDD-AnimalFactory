package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){

        Cat testCat = new Cat("tom",null, 25);
        CatHouse testCatHouse = new CatHouse();
        testCatHouse.add(testCat);
        int result = CatHouse.getNumberOfCats();
        Assert.assertEquals(1,result);
    }
    @Test
    public void removeTest(){
        Cat testCat = new Cat("tom",null, 25);
        CatHouse testCatHouse = new CatHouse();
        testCatHouse.remove(testCat);
        int result = CatHouse.getNumberOfCats();
        Assert.assertEquals(0,result);
    }







}
