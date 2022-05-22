package module;

import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList planets;

    public PlanetSystem(String name, Star centerStar, ArrayList planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Planet systemet " + name + " sin senter stjerne er " + centerStar +
                " og har planetene: " + planets + ".\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList planets) {
        this.planets = planets;
    }
}
