package tools;

import interfaces.ObjectFileHandler;
import models.CelestialBody;
import models.Star;

import java.io.*;
import java.util.ArrayList;

public class StarCSVFileHandler implements ObjectFileHandler <ArrayList<Star>> {
    @Override
    public void writeObjectToFile(ArrayList<Star> s, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String writeString = "name,radius,mass,effectiveTemp";
            bufferedWriter.write(writeString);
            bufferedWriter.newLine();
            for (Star star : s) {
                bufferedWriter.write(star.getName() + "," + star.getRadius() + "," +
                star.getMass() + "," + star.getEffectiveTemp());
                bufferedWriter.newLine();
            }

        }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
    @Override
    public ArrayList<Star> readObjectsFromFile(File file) {
        ArrayList<Star> returnStar = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                Star star = new Star(values[0], Double.parseDouble(values[1]), Double.parseDouble(values[2]),
                        Double.parseDouble(values[3]));
                returnStar.add(star);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }

        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        return returnStar;
    }


}
