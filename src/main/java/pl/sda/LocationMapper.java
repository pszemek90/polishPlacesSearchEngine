package pl.sda;

import pl.sda.model.City;
import pl.sda.model.Location;
import pl.sda.model.UrbanRural;
import pl.sda.model.Village;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LocationMapper {


    public static List<Location> mapLocations(List<String> rawLines, Map<Integer, String> voivodeships) {
        return rawLines.stream()
                .filter(line -> line.contains("gmina"))
                .map(filteredLine -> mapRow(filteredLine, voivodeships))
                .collect(Collectors.toList());
    }

    public static Location mapRow(String line, Map<Integer, String> voivodeships){
            String[] splitLine = line.split("[;,]");
            String type = splitLine[5];
            switch (type) {
                case "gmina wiejska":
                    return new Village(splitLine[4], voivodeships.get(Integer.parseInt(splitLine[0])));
                case "gmina miejska":
                    return new City(splitLine[4], voivodeships.get(Integer.parseInt(splitLine[0])));
                case "gmina miejsko-wiejska":
                    return new UrbanRural(splitLine[4], voivodeships.get(Integer.parseInt(splitLine[0])));
                default:
                    throw new IllegalArgumentException();
            }
    }

}
