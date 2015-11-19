package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;

public class Pamiatka {
    
    private int id;
    private String krajina;
    private String mesto;
    private String pamiatka;
    private Date datum;
    private String otvaracieHodiny_vstupne;
    private String podrobnosti;
    private int hodnotenie;

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
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

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPamiatka() {
        return pamiatka;
    }

    public void setPamiatka(String pamiatka) {
        this.pamiatka = pamiatka;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOtvaracieHodiny_vstupne() {
        return otvaracieHodiny_vstupne;
    }

    public void setOtvaracieHodiny_vstupne(String otvaracieHodiny_vstupne) {
        this.otvaracieHodiny_vstupne = otvaracieHodiny_vstupne;
    }

    public String getPodrobnosti() {
        return podrobnosti;
    }

    public void setPodrobnosti(String podrobnosti) {
        this.podrobnosti = podrobnosti;
    }
    
    
}
