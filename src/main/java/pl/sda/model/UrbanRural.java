package pl.sda.model;

public class UrbanRural extends Location{
    public UrbanRural(String name, String voivodeship) {
        super(name, voivodeship, LocationType.URBAN_RURAL);
    }

    @Override
    public String sayGreeting() {
        return "Welcome to urban-rural location of " + getName();
    }
}
