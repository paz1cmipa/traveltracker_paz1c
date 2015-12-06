package sk.upjs.ics.traveltracker_paz1c;

import java.sql.Time;
import java.util.Date;

public class KulturnePodujatie {
    
    private int id;
    private String krajina;
    private String mesto;
    private String lokalizacia; //nejaka koncertna hala, miesto kde to presne je
    private String nazov;
    private Date datum;
    private double vstupne;
    private Time casZaciatku;
    private String typ;
    private int hodnotenie;
    private String poznamky;
    private boolean navstivene;
    
        public Time getCasZaciatku() {
        return casZaciatku;
    }

    public void setCasZaciatku(Time casZaciatku) {
        this.casZaciatku = casZaciatku;
    }

    public boolean isNavstivene() {
        return navstivene;
    }

    public void setNavstivene(boolean navstivene) {
        this.navstivene = navstivene;
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

    public String getLokalizacia() {
        return lokalizacia;
    }

    public void setLokalizacia(String lokalizacia) {
        this.lokalizacia = lokalizacia;
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

    public double getVstupne() {
        return vstupne;
    }

    public void setVstupne(double vstupne) {
        this.vstupne = vstupne;
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
