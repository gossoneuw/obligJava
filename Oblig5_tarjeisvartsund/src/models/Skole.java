package models;

public class Skole extends Byggning{

    private String skoleType;
    private int elever;

    public Skole(double tomtLengde, double tomtBredde, String adresse, double lengde,
                  double bredde, double hoyde, int etasjer, String materiale, String skoleType, int elever) {
        super(tomtLengde, tomtBredde, adresse, lengde, bredde, hoyde, etasjer,
                materiale);
        this.skoleType = skoleType;
        this.elever = elever;
    }

    @Override
    public String toString() {
        return "skolen på " +
                getAdresse() + " er en " + skoleType + " med " + elever + " elever";
    }

    public String getSkoleType() {
        return skoleType;
    }

    public void setSkoleType(String skoleType) {
        this.skoleType = skoleType;
    }

    public int getElever() {
        return elever;
    }

    public void setElever(int elever) {
        this.elever = elever;
    }
}
