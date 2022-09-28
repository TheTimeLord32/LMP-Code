/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esame_21_09_13_2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dariocalore
 */
public class Persona {
    static ArrayList<Persona> registro = new ArrayList();
    private String nome;
    private String cognome;
    private String codiceF;
    private Date dataNascita;
    private String luogoNascita;
    private Date dataMorte;
    private Persona padre;
    private Persona madre;
    private ArrayList<Persona> coniugi = new ArrayList();
    private ArrayList<Persona> figli = new ArrayList();

    public Persona(String nome, String cognome, String codiceF, Date dataNascita, String luogoNascita, Persona padre, Persona madre) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceF = codiceF;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.padre = padre;
        this.madre = madre;
        padre.getFigli().add(this);
        madre.getFigli().add(this);
    }

    public Persona(String nome, String cognome, String codiceF, Date dataNascita, String luogoNascita, Date dataMorte, Persona padre, Persona madre) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceF = codiceF;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.dataMorte = dataMorte;
        this.padre = padre;
        this.madre = madre;
        padre.getFigli().add(this);
        madre.getFigli().add(this);
    }

    public Persona(String nome, String cognome, String codiceF, Date dataNascita, String luogoNascita, Date dataMorte) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceF = codiceF;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.dataMorte = dataMorte;
        this.padre = null;
        this.madre = null;
    }



    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceF() {
        return codiceF;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public ArrayList<Persona> getConiugi() {
        return coniugi;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public void setConiugi(ArrayList<Persona> coniugi) {
        this.coniugi = coniugi;
    }

    public ArrayList<Persona> getFigli() {
        return figli;
    }

    public void setFigli(ArrayList<Persona> figli) {
        this.figli = figli;
    }


    public int dimAlbero(){
        int resPadre = 0;
        int resMadre = 0;
        Persona temp = this;
        while(temp.padre != null){
            resPadre = resPadre+1;
            temp = temp.padre;
        }
        temp = this;
        while(temp.madre != null){
            resMadre = resMadre+1;
            temp = temp.madre;
        }
        if(resPadre > resMadre){
            return resPadre;
        }
        return resMadre;
    }

    public ArrayList<Persona> getFamiglia(){
        ArrayList<Persona> res = new ArrayList();
        res.addAll(this.padre.getFigli());
        res.addAll(this.madre.getFigli());
        for(Persona p : this.madre.madre.getFigli()){
            res.addAll(p.getFigli());
        }
        for(Persona p : this.padre.padre.getFigli()){
            res.addAll(p.getFigli());
        }
        for(Persona p: this.padre.madre.getFigli()){
                res.addAll(p.getFigli());
        }
        for(Persona p: this.madre.padre.getFigli()){
            res.addAll(p.getFigli());
        }
        return res;
    }

    public static ArrayList<Persona> getNDiscendenti(Persona persona,int n){
        ArrayList<Persona> res = new ArrayList();
        Persona temp = persona;
        for(int i = 0; i < n; i++){
            res.addAll(temp.getFigli());

        }
        temp = persona;
        for(int i = 0; i < n; i++){
            res.addAll(temp.getFigli());

        }
        return res;
    }


}
