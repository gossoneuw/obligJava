package module;

public class Star {
    private String name;
    private double radius;
    private double mass;
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    public double radiusToKmStar() {
        return radius * 695700;
    }

    public double massToKgStar() {
        return mass * 1.98892E30;
    }

    @Override
    public String toString() {
        return "Stjernen " + name + " har en radius på " + radius + " Rsun og en masse på " + mass + " Msun, tempraturen er "
                + effectiveTemp + "c.\n";
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

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
