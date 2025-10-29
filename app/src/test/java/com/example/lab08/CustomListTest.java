package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * class to test the methods for list of Cities
 * @author macy [and lab TAs]
 */
public class CustomListTest {
    
    /**
     * tests whether or not the list has the given City
     * test both cases?
     */
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    
    /**
     * tests whether the given City was deleted
     */
    @Test
    void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        list.getCity(0);
        assertEquals(1, list.getSize()); // counts how many cities in list
        list.deleteCity(edmonton);
        assertEquals(0, list.getSize());
    }

    /**
     * tests whether deleteCity() method's Exception is thrown
     */
    @Test
    void testDeleteCityException() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        list.getCity(0);
        assertEquals(1, list.getSize()); // counts how many cities in list
        City city = new City("Regina", "Saskatchewan");
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(city); // checks if city that does not exist in list throws an exception
        });
        assertEquals(1, list.getSize()); // should still be one because nothing was deleted
    }

    /**
     * tests whether the given amount of Cities in the list is correct
     */
    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        City yellowknife = new City("Yellowknife", "Northwest Territories");
        list.addCity(yellowknife);
        assertEquals(1, list.countCities());
        City charlottetown = new City("Charlottetown", "Prince Edward Island");
        list.addCity(charlottetown);
        assertEquals(2, list.countCities());
        City regina = new City("Regina", "Saskatchewan");
        list.addCity(regina);
        assertEquals(3, list.countCities());
        // deletes City to see if counts right
        // (since we've already tested whether deleteCity works right)
        list.deleteCity(regina);
        assertEquals(2, list.countCities());
    }

}