/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author NANCY
 */
public class Matrimonio {
    private int id;
    private Date fecha;
    private String lugar;
    private Participantes contrayente1;
    private Participantes contrayente2;
    private Participantes testigo1;
    private Participantes testigo2;
    private AutoridadCivil autiridadCivil;

    public Matrimonio() {
    }

    public Matrimonio(int id, Date fecha, String lugar, Participantes contrayente1, Participantes contrayente2, Participantes testigo1, Participantes testigo2, AutoridadCivil autiridadCivil) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.contrayente1 = contrayente1;
        this.contrayente2 = contrayente2;
        this.testigo1 = testigo1;
        this.testigo2 = testigo2;
        this.autiridadCivil = autiridadCivil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Participantes getContrayente1() {
        return contrayente1;
    }

    public void setContrayente1(Participantes contrayente1) {
        this.contrayente1 = contrayente1;
    }

    public Participantes getContrayente2() {
        return contrayente2;
    }

    public void setContrayente2(Participantes contrayente2) {
        this.contrayente2 = contrayente2;
    }

    public Participantes getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(Participantes testigo1) {
        this.testigo1 = testigo1;
    }

    public Participantes getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Participantes testigo2) {
        this.testigo2 = testigo2;
    }

    public AutoridadCivil getAutiridadCivil() {
        return autiridadCivil;
    }

    public void setAutiridadCivil(AutoridadCivil autiridadCivil) {
        this.autiridadCivil = autiridadCivil;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matrimonio other = (Matrimonio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrimonio{" + "id=" + id + ", fecha=" + fecha + ", lugar=" + lugar + ", contrayente1=" + contrayente1 + ", contrayente2=" + contrayente2 + ", testigo1=" + testigo1 + ", testigo2=" + testigo2 + ", autiridadCivil=" + autiridadCivil + '}';
    }
    
}
