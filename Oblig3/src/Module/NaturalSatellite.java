package Module;

import tools.Enheter;

public abstract class NaturalSatellite extends CelestialBody {

    private double semiMajorAxis;
    private double eccentricity;
    private double orbitalPeriod;
    private String centralCelestialBody;
    public static final double ENAU = 149_597_871;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity,
                            double orbitalPeriod, String centralCelestialBody) {
        super(name, radius, mass);

        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double distanceToCentralBody(double degrees) {
        return (semiMajorAxis * (1-Math.pow(eccentricity,2)))
                /(1+eccentricity*Math.cos(Math.toRadians(degrees)))*ENAU;
    }

    public double orbitingVelocity(double distance) {
        return Math.sqrt((Enheter.GRAVITYCONSTANT * 1.98892E30)/(distance*1000));
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(String centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }
}
