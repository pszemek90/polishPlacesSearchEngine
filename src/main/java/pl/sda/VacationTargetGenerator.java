package pl.sda;

import pl.sda.model.Location;
import pl.sda.model.LocationType;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VacationTargetGenerator {
    public static Location getRandomLocation(List<Location> locations){
        return locations.get(new Random().nextInt(locations.size()));
    }

    public static Location getRandomLocation(List<Location> locations, LocationType locationType){
        List<Location> filteredList = locations.stream()
                .filter(x -> x.getType() == locationType)
                .collect(Collectors.toList());

        return filteredList.get(new Random().nextInt(filteredList.size()));
    }
}
