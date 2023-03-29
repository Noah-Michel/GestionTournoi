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
 * La classe Terrain référence les différents terrain où vont se jouer les matchs
 */
public class Terrain {
    public String nom;
    public int nbPlaces;
    
    /**
     * Constructeur
     * @param nom Le nom du terrain
     * @param nb  Le nombre de places 
     */
    public Terrain(String nom, int nb){
        this.nom = nom;
        this.nbPlaces = nb;
    }
    
    public String getNom() {
        return nom;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }
    
}
