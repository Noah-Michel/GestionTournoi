/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionplanning;

/**
 *
 * @author Emrys
 * 
 */

/**
 * 
 * La classe Arbitre permet de référencer tous les arbitres qui participent au tournoi
 */
public class Arbitre {
    public String nom;
    public String prenom;
    public String nationalite;
    
    /**
     * Un arbitre est créer à partir de son nom, son prénom et sa nationalité
     * @param prenom 
     * prenom de l'arbitre
     * @param nom 
     * nom de l'arbitre
     * @param natio 
     * sa nationalité
     */
    public Arbitre(String prenom, String nom, String natio){
        this.nom = nom;
        this.prenom =prenom;
        this.nationalite = natio;
    }
    
    
    /**
     * Ce getter permet d'avoir le nom de l'arbitre
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Ce getter permet d'avoir le prénom de l'arbitre
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     * Ce getter permet d'avoir la nationalité de l'arbitre
     * @return nationalite
     */
    public String getNationalite() {
        return nationalite;
    } 
    
}
