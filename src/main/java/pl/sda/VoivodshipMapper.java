package pl.sda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoivodshipMapper {

    public static Map<Integer, String> mapVoivodships(List<String> listOfDataRows) {
        Map<Integer, String> voivodships = new HashMap<>();
        for (String row : listOfDataRows) {
            if (row.contains("województwo")) {
                String[] splittedRow = row.split(";");
                voivodships.put(Integer.parseInt(splittedRow[0]), splittedRow[4]);
            }
        }
        return voivodships;
    }

    public static Map<Integer, String> mapVoivodshipsWithStreams(List<String> listOfDataRows) {
        Map<Integer, String> voivodships = new HashMap<>();
        listOfDataRows.stream()
                .filter(x -> x.contains("województwo"))
                .forEach(x -> {
                    String[] splittedLines = x.split(";");
                    voivodships.put(Integer.parseInt(splittedLines[0]), splittedLines[4]);
                });
        return voivodships;
    }
}
