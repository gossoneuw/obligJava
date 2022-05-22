package Module;

import tools.Enheter;

public class Star extends CelestialBody{

    private final static int RSUN = 695700;
    private final static double MSUN = 1.98892E30;

    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);

        this.effectiveTemp = effectiveTemp;
    }

    public double getSurfaceGravity() {
        return (Enheter.GRAVITYCONSTANT * getMassInKg()) / Math.pow(getRadiusInKm()*1000, 2);
    }

    public double getRadiusInKm() {
        return getRadius() * RSUN;
    }

    public double getMassInKg() {
        return getMass() * MSUN;
    }


    @Override
    public String toString() {
        return "The star " + getName() + " has a radius of " + getRadius() +
                " Rsun, and a mass of " + getMass() + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }


    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }


}

