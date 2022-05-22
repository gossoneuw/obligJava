package models;

public class Butikk extends Byggning{

    private String vareType;
    private int ansatte;

    public Butikk(double tomtLengde, double tomtBredde, String adresse, double lengde,
                  double bredde, double hoyde, int etasjer, String materiale, String vareType, int ansatte) {
        super(tomtLengde, tomtBredde, adresse, lengde, bredde, hoyde, etasjer,
                materiale);
        this.vareType = vareType;
        this.ansatte = ansatte;
    }

    @Override
    public String toString() {
        return "Butikken på " +
                getAdresse() + " er en " + vareType + "butikk, med " + ansatte + " ansatte";
    }

    public String getVareType() {
        return vareType;
    }

    public void setVareType(String vareType) {
        this.vareType = vareType;
    }

    public int getAnsatte() {
        return ansatte;
    }

    public void setAnsatte(int ansatte) {
        this.ansatte = ansatte;
    }
}