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
 * La fonction Joueur permet de référencer les joueurs participant au tournoi
 */
public class Joueur {
    public String nom;
    public String prenom;
    public String sex;
    public String nationalite;
    public int rang;
    
    /**
     * Un joueur est créer à partir de son prénom, son nom, son sex, sa nationalité et son classement mondial
     * @param prenom prenom du joueur
     * @param nom son nom
     * @param sex son sex
     * @param natio sa nationalité
     * @param rang son classement mondial
     */
    public Joueur(String prenom, String nom, String sex, String natio, int rang){
        this.nom = nom;
        this.prenom = prenom;
        this.sex = sex;
        this.nationalite = natio;
        this.rang = rang;
    }
    /**
     * Ce getter permet d'avoir le nom du joueur
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Ce getter permet d'avoir le prénom du joueur
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Ce getter permet d'avoir la nationalité du joueur
     * @return nationalite
     */
    public String getNationalite() {
        return nationalite;
    }
    
    /**
     * Ce getter permet d'avoir le rang du joueur
     * @return rang
     */
    public int getRang() {
        return rang;
    }
}
