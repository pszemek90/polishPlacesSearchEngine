package pl.sda;

import org.junit.Test;
import pl.sda.model.Location;
import pl.sda.util.TestDataProvider;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LocationMapperTest {

    @Test
    public void testMapping(){
        //given
        List<String> loadedData = TestDataProvider.loadedData;
        Map<Integer, String> mappedData = TestDataProvider.mappedData;
        //when
        List<Location> locations = LocationMapper.mapLocations(loadedData, mappedData);
        //then
        assertEquals(4, locations);
    }

}