// Mountain.java

public class Mountain {
    private String name;
    private String country;
    private double elevation;

    public Mountain(String name, String country, double elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public double toMeters() {
        return elevation / 3.2808;
    }
}
