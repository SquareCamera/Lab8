package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void testHasCity() {
        //add a city and check if hasCity is true
        list = MockCityList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertEquals(Boolean.TRUE, list.hasCity(city));
    }
    @Test
    public void testDeletecity(){
        //delete the city and check if hasCity is false
        list = MockCityList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertEquals(Boolean.TRUE, list.hasCity(city));
        list.deleteCity(city);
        assertEquals(Boolean.FALSE, list.hasCity(city));
    }
    @Test
    public void testCountCities(){
        //check if count goes up and then down after deleting
        list = MockCityList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertEquals(1, list.countCities());
        list.deleteCity(city);
        assertEquals(0, list.countCities());
    }


}
