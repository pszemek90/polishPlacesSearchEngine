package pl.sda;

import pl.sda.model.Location;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> rows = DataLoader.loadData("TERC.csv");
        Map<Integer, String> voivodships = VoivodshipMapper.mapVoivodships(rows);
        List<Location> locations = LocationMapper.mapLocations(rows, voivodships);
        try {
            InvitationGenerator.generateInvitationFile(VacationTargetGenerator.getRandomLocation(locations));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(LocationAnalyzer.listLongestLocationsWithoutSpaces(locations));
        System.out.println(LocationAnalyzer.longestNameLocationsByVoivodship(locations));
    }
}
