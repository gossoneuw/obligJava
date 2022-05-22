package models;

public class Byggning extends Tomt{

    private double lengde, bredde, hoyde;

    private int etasjer;

    private String materiale;


    public Byggning(double tomtLengde, double tomtBredde, String adresse, double lengde,
                     double bredde, double hoyde, int etasjer, String materiale) {
        super(tomtLengde, tomtBredde, adresse);
        this.lengde = lengde;
        this.bredde = bredde;
        this.hoyde = hoyde;
        this.etasjer = etasjer;
        this.materiale = materiale;
    }

    public double getKubikkmeter() {
        return getBredde() * getLengde() * getHoyde();
    }


    public double getLengde() {
        return lengde;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }

    public double getBredde() {
        return bredde;
    }

    public void setBredde(double bredde) {
        this.bredde = bredde;
    }

    public double getHoyde() {
        return hoyde;
    }

    public void setHoyde(double hoyde) {
        this.hoyde = hoyde;
    }

    public int getEtasjer() {
        return etasjer;
    }

    public void setEtasjer(int etasjer) {
        this.etasjer = etasjer;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
}
