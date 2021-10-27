import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("city1", "province1");
        list.addCity(city);
        City city2 = new City("asdf", "jkl");

        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(city2));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("city1", "province1");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCityTest(){
        assertEquals(0, list.countCities());
        City city = new City("city1", "province1");
        list.add(city);
        assertEquals(1, list.countCities());
    }

}
