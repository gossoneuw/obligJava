package models;

public class Hus extends Byggning{

    private int beboere;


    public Hus(double tomtLengde, double tomtBredde, String adresse, double lengde,
               double bredde, double hoyde, int etasjer, String materiale, int beboere) {
        super(tomtLengde, tomtBredde, adresse, lengde, bredde, hoyde, etasjer,
                materiale);
        this.beboere = beboere;
    }

    @Override
    public String toString() {
        return "huset på " +
                getAdresse() + " er laget av " + getMateriale() + ", det bor " + beboere + " der";
    }

    public int getBeboere() {
        return beboere;
    }

    public void setBeboere(int beboere) {
        this.beboere = beboere;
    }
}
