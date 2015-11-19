package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;

public class KulturnePodujatie {
    
    private int id;
    private String krajina;
    private String mesto;
    private String lokacia; //nejaka koncertna hala, miesto kde to presne je
    private String nazov;
    private Date datum;
    private int vstupne;
    private String zaciatok;
    private String typ;
    private int hodnotenie;
    private String poznamky;

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

    public String getLokacia() {
        return lokacia;
    }

    public void setLokacia(String lokacia) {
        this.lokacia = lokacia;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getVstupne() {
        return vstupne;
    }

    public void setVstupne(int vstupne) {
        this.vstupne = vstupne;
    }

    public String getZaciatok() {
        return zaciatok;
    }

    public void setZaciatok(String zaciatok) {
        this.zaciatok = zaciatok;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
    }

    public String getPoznamky() {
        return poznamky;
    }

    public void setPoznamky(String poznamky) {
        this.poznamky = poznamky;
    }
    
}
