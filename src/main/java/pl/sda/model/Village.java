package pl.sda.model;

public class Village extends Location{
    public Village(String name, String voivodeship) {
        super(name, voivodeship, LocationType.VILLAGE);
    }

    @Override
    public String sayGreeting() {
        return "Welcome to beautiful village of " + getName();
    }
}
