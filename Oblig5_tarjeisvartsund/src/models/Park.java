package models;

public class Park extends Tomt{
    private String innhold;
    private String navn;


    public Park(double tomtLengde, double tomtBredde, String adresse, String innhold, String navn){
        super(tomtLengde, tomtBredde, adresse);
        this.innhold = innhold;
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Park: " +
                "innhold='" + innhold + '\'' +
                '}';
    }

    public String getInnhold() {
        return innhold;
    }

    public void setInnhold(String innhold) {
        this.innhold = innhold;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
