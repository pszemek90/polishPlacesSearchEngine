package pl.sda;

import pl.sda.model.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class LocationAnalyzer {
    public static List<Location> listLongestLocations(List<Location> allLocations) {
        OptionalInt maxLength = allLocations.stream()
                .mapToInt(x -> x.getName().length())
                .max();
        int max = maxLength.orElse(0);

        return allLocations.stream()
                .filter(x -> x.getName().length() == max)
                .collect(Collectors.toList());
    }

    public static List<Location> listLongestLocationsWithoutSpaces(List<Location> allLocations) {
        OptionalInt maxLength = allLocations.stream()
                .filter(x -> !(x.getName().contains(" ")))
                .filter(x -> !x.getName().contains("-"))
                .mapToInt(x -> x.getName().length())
                .max();
        int max = maxLength.orElse(0);

        return allLocations.stream()
                .filter(x -> !x.getName().contains(" "))
                .filter(x -> !x.getName().contains("-"))
                .filter(x -> x.getName().length() == max)
                .collect(Collectors.toList());
    }

    public static Map<String, List<Location>> longestNameLocationsByVoivodship(List<Location> allLocations) {
        Map<String, List<Location>> longestNameByVoivodeship = new HashMap<>();
        allLocations.stream()
                .collect(Collectors.groupingBy(Location::getVoivodeship))
                .forEach((k, v) -> {
                    longestNameByVoivodeship.put(k,listLongestLocations(v));
                });
        return longestNameByVoivodeship;
    }
}
