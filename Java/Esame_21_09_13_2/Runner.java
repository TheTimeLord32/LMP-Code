/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esame_21_09_13_2;
import java.util.Date;
/**
 *
 * @author dariocalore
 */
public class Runner {
    public static void main (String[] args) {
        
        Persona p1 = new Persona("Mario","Rossi","MRAROS88T249Y54F",new Date(1920,3,2),"Orbetello",new Date(1990,5,6));
        Persona p2 = new Persona("Maria","Verdi","MRAVRS68T249Y57F",new Date(1925,5,5),"Orbetello",new Date(1995,7,7));
        Persona p3 = new Persona("Dario","Daddario","DDRDART249Y57F",new Date(1960,5,5),"Orbetello",p1,p2);
        System.out.println(p1.getFigli());

        System.out.println(p3.dimAlbero());
        
    }
}
