package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class ViacdnovyVylet {
    
    private int id;
    private String krajina;
    private String mesto1;
    private Date datumOdchod;
    private Date datumPrichod;
    private int hodnotenie;
    private String poznamky;
    private String program;
    private String ubytovanie;
    private String typ;
    private boolean navstivene;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public boolean isNavstivene() {
        return navstivene;
    }

    public void setNavstivene(boolean navstivene) {
        this.navstivene = navstivene;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getUbytovanie() {
        return ubytovanie;
    }

    public void setUbytovanie(String ubytovanie) {
        this.ubytovanie = ubytovanie;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }

    public String getMesto1() {
        return mesto1;
    }

    public void setMesto1(String mesto1) {
        this.mesto1 = mesto1;
    }

    public Date getDatumOdchod() {
        return datumOdchod;
    }

    public void setDatumOdchod(Date datumOdchod) {
        this.datumOdchod = datumOdchod;
    }

    public Date getDatumPrichod() {
        return datumPrichod;
    }

    public void setDatumPrichod(Date datumPrichod) {
        this.datumPrichod = datumPrichod;
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
