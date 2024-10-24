package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * Create a mock list for testing.
     * @return a mock CustomList instance.
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * Test if adding a city increases the list size by one.
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int initialSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(initialSize + 1, list.getCount());
    }
}

