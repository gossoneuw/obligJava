package module;

public class Planet {
    private String name;
    private double radius;
    private double mass;
    public float jaja = 0.1;


    public Planet(String name,
                  double radius,
                  double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    public double radiusToKmPlanet() {
        return radius * 71492;
    }
    public double massToKgPlanet() {
        return mass * 1.898E27;
    }

    public double surfaceGravity() {
        return (0.0000000000667408 * massToKgPlanet())/((radiusToKmPlanet() * 1000.0)*(radiusToKmPlanet() * 1000.0));
    }


    @Override
    public String toString() {
        return "Planeten " + name + " har en radius på " + radius + " Rjup og en masse på " + mass + " Mjup.\n";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
