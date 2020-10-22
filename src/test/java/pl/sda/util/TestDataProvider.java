package pl.sda.util;

import java.util.List;
import java.util.Map;

public class TestDataProvider {

    public static List<String> loadedData = List.of(
            "WOJ;POW;GMI;RODZ;NAZWA;NAZWA_DOD;STAN_NA",
            "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
            "02;01;;;bolesławiecki;powiat;2020-01-01",
            "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
            "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
            "04;;;;inne woj;województwo;2020-01-01"
    );

    public static final Map<Integer, String> mappedData = Map.of(
            2, "DOLNOŚLĄSKIE",
            67, "PRUSY KRÓLEWSKIE"
    );

}
