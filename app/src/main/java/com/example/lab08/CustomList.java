package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

/**
 * class that keeps track of each Cities
 * @author macy [and lab TAs]
 */
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }
    
    /**
     * adds City to list if City does not exist
     * @param city: given City to add
     * @throws IllegalArgumentException error if list already contains given City
     */
    public void addCity(City city) {
        cities.add(city);
    }
    
    /**
     * gets City from list
     * @param position: asks what position the city user wants from
     */
    public void getCity(int position) {
        cities.get(position);
    }
    
    /**
     * gets size of list
     *
     * @return size of list
     */
    public int getSize() {
        return cities.size();
    }
    
    /**
     * returns Boolean of whether given City already exist in list
     * @param city: given City of what to check in the list
     * @return returns Boolean
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    
    /**
     * deletes a City from the list
     * @param city: given City of what to remove from list
     * @throws IllegalArgumentException error if list already contains given City
     */
    public void deleteCity(City city) {
        // deletes city if in list
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else { // throws an Exception if the given City is not in the list
            throw new IllegalArgumentException("This city does not exist! Please try again.");
        }
    }
    
    /**
     * counts how many Cities are in the list
     * @return returns the number of items in the list
     */
    public int countCities() {
        return cities.size();
    }
}
