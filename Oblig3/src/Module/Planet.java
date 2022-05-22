package Module;

import tools.Enheter;

public class Planet extends NaturalSatellite {

    private final static int RJUP = 71492;
    private final static double MJUP = 1.898E27;


    public Planet(String name, double radius, double mass, double semiMajorAxis,
                  double eccentricity, double orbitalPeriod, String centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public double getRadiusInKm() {
        return getRadius() * RJUP;
    }

    public double getMassInKg() {
        return getMass() * MJUP;
    }

    public double radiusInRearth() {
        return getRadiusInKm() / 6371;
    }

    public double massInMearth() {
        return getMassInKg() / 5.972E24;
    }

    public double getSurfaceGravity() {
        return (Enheter.GRAVITYCONSTANT * getMassInKg()) / Math.pow(getRadiusInKm() * 1000, 2);
    }

    @Override
    public String toString() {
        return "The planet " + getName() + " has a radius of " + getRadius() +
                " Rjup, and a mass of " + getMass() + " Mjup.";
    }


}
