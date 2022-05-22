import module.Planet;
import module.PlanetSystem;
import module.Star;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        System.out.println(planets);

        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        System.out.println(sun);

        PlanetSystem solarSystem = new PlanetSystem("solar system", sun, planets);

        System.out.println(solarSystem);

        System.out.println("saturn weight: " + saturn.massToKgPlanet()+"kg");
        System.out.println("saturn radius in kg: " + saturn.radiusToKmPlanet()+"km");
        System.out.println();
        System.out.println("sun's weight: " + sun.massToKgStar()+"kg");
        System.out.println("sun's radius in kg: " + sun.radiusToKmStar()+"km");
        System.out.println();
        System.out.println(neptune.surfaceGravity() + "m/s^2");




    }
}
