/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionplanning;

import java.util.List;

/**
 *
 * @author Emrys
 *
 */

/**
 * 
 * La fonction match permet de créer un match avec 2 joueurs, 1 arbitre principale, 2 arbitres de ligne et un terrain
 */
public class Match {
    public String tour;
    public Terrain terrain;
    public String type;
    public Joueur joueur1, joueur2;
    public Joueur gagnant;
    public Arbitre arbitreP;
    public List arbitreL;
    int[][] scoreMatch = new int[5][2];
    
    /**
     * Constucteur
     * @param tour tour dans le tournoi
     * @param terrain terrain sur lequel est jouer le match
     * @param type type de la rencontre (simple homme, double femme, ...)
     * @param j1 joueur 1
     * @param j2 joueur 2
     * @param aP Arbitre principal
     * @param aL Arbitre de ligne
     */
    public Match(String tour, Terrain terrain, String type, Joueur j1, Joueur j2, Arbitre aP, List aL){
        this.tour = tour;
        this.terrain = terrain;
        this.type = type;
        this.joueur1 = j1;
        this.joueur2 = j2;
        this.arbitreP = aP;
        this.arbitreL = aL;
    }

    //Getters
    public String getTour() {
        return tour;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public String getType() {
        return type;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public Arbitre getArbitreP() {
        return arbitreP;
    }

    public List getArbitreL() {
        return arbitreL;
    }

    public int[][] getScoreMatch() {
        return scoreMatch;
    }
    
    //Setters
    public void setScoreMatch(int[] scoreSet, int set) {
        scoreMatch[set] = scoreSet; 
    }
    
    public void setGagnant(Joueur j){
        gagnant = j;
    }
    
}
