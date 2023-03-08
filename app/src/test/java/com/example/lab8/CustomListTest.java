package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, cityList);
        City city = new City("Estevan", "SK");
        int listSize = list.getCount();
        assertEquals(list.getCount(),listSize + 1);
    }


}
