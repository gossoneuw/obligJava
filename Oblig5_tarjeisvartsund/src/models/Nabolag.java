package models;

import java.util.ArrayList;

public class Nabolag {
    private int postNr;
    private ArrayList<Byggning> Byggninger;

    public Nabolag(int postNr, ArrayList<Byggning> byggninger) {
        this.postNr = postNr;
        this.Byggninger = byggninger;
    }


    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(int postNr) {
        this.postNr = postNr;
    }

}
