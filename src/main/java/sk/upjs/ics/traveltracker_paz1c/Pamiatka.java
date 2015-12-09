package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;

public class Pamiatka {
    
    private int id;
    private String krajina;
    private String mesto;
    private String pamiatka_zaujimavost;
    private Date datum;
    private String otvaracieHodiny;
    private double vstupne;
    private String podrobnosti;
    private int hodnotenie;
    private boolean navstivene;

    public boolean isNavstivene() {
        return navstivene;
    }

    public void setNavstivene(boolean navstivene) {
        this.navstivene = navstivene;
    }

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

    public String getPamiatka_zaujimavost() {
        return pamiatka_zaujimavost;
    }

    public void setPamiatka_zaujimavost(String pamiatka_zaujimavost) {
        this.pamiatka_zaujimavost = pamiatka_zaujimavost;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOtvaracieHodiny() {
        return otvaracieHodiny;
    }

    public void setOtvaracieHodiny(String otvaracieHodiny) {
        this.otvaracieHodiny = otvaracieHodiny;
    }

    public double getVstupne() {
        return vstupne;
    }

    public void setVstupne(double vstupne) {
        this.vstupne = vstupne;
    }
    

    public String getPodrobnosti() {
        return podrobnosti;
    }

    public void setPodrobnosti(String podrobnosti) {
        this.podrobnosti = podrobnosti;
    }
    
    
}
