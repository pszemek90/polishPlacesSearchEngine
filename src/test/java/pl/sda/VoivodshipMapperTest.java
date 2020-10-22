package pl.sda;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VoivodshipMapperTest {

    @Test
    public void mappingTest() {
        //given
        List<String> loadedData = List.of(
                "WOJ;POW;GMI;RODZ;NAZWA;NAZWA_DOD;STAN_NA",
                "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
                "02;01;;;bolesławiecki;powiat;2020-01-01",
                "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
                "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
                "04;;;;inne woj;województwo;2020-01-01"
        );
        //when
        Map<Integer, String> results = VoivodshipMapper.mapVoivodshipsWithStreams(loadedData);
        //then
        assertEquals(2, results.size());

    }

}