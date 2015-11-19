package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;

public class ViacdnovyVylet {
    
    private String krajina;
    private String mesto;
    private Date odchod;
    private Date prichod;
    private int hodnotenie;
    private String poznamky;
    private String program;

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

    public Date getOdchod() {
        return odchod;
    }

    public void setOdchod(Date odchod) {
        this.odchod = odchod;
    }

    public Date getPrichod() {
        return prichod;
    }

    public void setPrichod(Date prichod) {
        this.prichod = prichod;
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
}
