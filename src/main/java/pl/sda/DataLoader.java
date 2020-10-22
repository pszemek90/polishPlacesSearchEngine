package pl.sda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class DataLoader {
    public static List<String> loadData(String path){
        List<String> dataStringRows;
        try {
            dataStringRows = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            System.out.println("Błąd wczytywania pliku");
            return Collections.emptyList();
        }
        return dataStringRows;
    }
}
