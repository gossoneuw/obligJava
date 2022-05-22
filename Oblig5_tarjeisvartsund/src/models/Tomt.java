package models;

public class Tomt {
    private double tomtLengde, tomtBredde;
    private String adresse;


    public Tomt(double tomtLengde, double tomtBredde, String adresse) {
        this.tomtLengde = tomtLengde;
        this.tomtBredde = tomtBredde;
        this.adresse = adresse;
    }


    public double getTomtLengde() {
        return tomtLengde;
    }

    public void setTomtLengde(double tomtLengde) {
        this.tomtLengde = tomtLengde;
    }

    public double getTomtBredde() {
        return tomtBredde;
    }

    public void setTomtBredde(double tomtBredde) {
        this.tomtBredde = tomtBredde;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
