package pl.sda;

import org.junit.Before;
import org.junit.Test;
import pl.sda.model.Location;
import pl.sda.model.Village;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class LocationAnalyzerTest {
    private List<Location> testLocation;

    @Before
    public void setUp() throws Exception {
        testLocation = new ArrayList<>();
        testLocation.add(new Village("Pcim Dolny", "POMORSKIE"));
        testLocation.add(new Village("MIPC Dolny", "POMORSKIE"));
        testLocation.add(new Village("Pruszków", "POMORSKIE"));
        testLocation.add(new Village("Warszawa", "WARSZAWSKIE"));
    }

    @Test
    public void shouldReturnTwoLocations() throws Exception {
        //when
        List<Location> result = LocationAnalyzer.listLongestLocations(testLocation);
        //then
        assertEquals(2, result.size());

        List<Location> filteredByPomorskie = result.stream()
                .filter(location -> location.getVoivodeship().equals("POMORSKIE"))
                .collect(Collectors.toList());

        assertEquals(2, filteredByPomorskie.size());
    }
}