package pl.sda;

import pl.sda.model.Location;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class InvitationGenerator {
    public static void generateInvitationFile(Location location) throws IOException {
        List<String> greetingText = List.of(location.sayGreeting(), "Thank you for using our application");
        Files.write(Path.of("greeting.txt"), greetingText, StandardOpenOption.CREATE);
    }
}
