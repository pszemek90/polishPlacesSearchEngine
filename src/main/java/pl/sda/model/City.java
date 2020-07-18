package pl.sda.model;

public class City extends Location{
    public City(String name, String voivodeship) {
        super(name, voivodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting() {
        return "Welcome to the fast city of " + getName();
    }
}
