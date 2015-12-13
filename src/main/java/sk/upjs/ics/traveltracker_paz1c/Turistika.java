package sk.upjs.ics.traveltracker_paz1c;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Turistika {

    
    private int id;
    private String krajina;
    private String ciel;
    private Date datum;
    private String typ;
    private String trasa;
    private String poznamky;
    private int hodnotenie;
    private boolean prejdene; //navstivene
    private SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");

    public boolean isPrejdene() {
        return prejdene;
    }

    public void setPrejdene(boolean prejdene) {
        this.prejdene = prejdene;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }

    public String getCiel() {
        return ciel;
    }

    public void setCiel(String ciel) {
        this.ciel = ciel;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getTrasa() {
        return trasa;
    }

    public void setTrasa(String trasa) {
        this.trasa = trasa;
    }

    public String getPoznamky() {
        return poznamky;
    }

    public void setPoznamky(String poznamky) {
        this.poznamky = poznamky;
    }

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
    }

    @Override
    public String toString() {
        return krajina + ", " + ciel + "(" + dateFormat.format(datum) + ")";
    }
    
    
    
}
