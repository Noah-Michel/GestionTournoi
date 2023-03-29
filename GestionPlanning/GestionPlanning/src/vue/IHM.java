/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import gestionplanning.Arbitre;
import gestionplanning.Joueur;
import gestionplanning.Match;
import gestionplanning.Terrain;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Emrys
 */
public class IHM extends javax.swing.JFrame {

    /**
     * Creates new form VIHM
     */
    public IHM() {
        initComponents();
        //Joueurs
        //Joueur j1 = new Joueur("", "", "", "", );
        //Joueur j2 = new Joueur("", "", "", "", );
        //Joueur j3 = new Joueur("", "", "", "", );
        //Joueur j4 = new Joueur("", "", "", "", );
        //Joueur j5 = new Joueur("", "", "", "", );
        //Joueur j6 = new Joueur("", "", "", "", );
        //Joueur j7 = new Joueur("", "", "", "", );
        //Joueur j8 = new Joueur("", "", "", "", );
        //Joueur j9 = new Joueur("", "", "", "", );
        //Joueur j10 = new Joueur("", "", "", "", );
        //Joueur j11 = new Joueur("", "", "", "", );
        //Joueur j12 = new Joueur("", "", "", "", );
        //Joueur j13 = new Joueur("", "", "", "", );
        //Joueur j14 = new Joueur("", "", "", "", );
        //Joueur j15 = new Joueur("", "", "", "", );
        //Joueur j16 = new Joueur("", "", "", "", );
        //Joueur j17 = new Joueur("", "", "", "", );
        //Joueur j18 = new Joueur("", "", "", "", );
        //Joueur j19 = new Joueur("", "", "", "", );
        //Joueur j20 = new Joueur("", "", "", "", );
        //Joueur j21 = new Joueur("", "", "", "", );
        //Joueur j22 = new Joueur("", "", "", "", );
        //Joueur j23 = new Joueur("", "", "", "", );
        //Joueur j24 = new Joueur("", "", "", "", );
        //Joueur j25 = new Joueur("", "", "", "", );
        //Joueur j26 = new Joueur("", "", "", "", );
        //Joueur j27 = new Joueur("", "", "", "", );
        //Joueur j28 = new Joueur("", "", "", "", );
        //Joueur j29 = new Joueur("", "", "", "", );
        //Joueur j30 = new Joueur("", "", "", "", );
        //Joueur j31 = new Joueur("", "", "", "", );
        //Joueur j32 = new Joueur("", "", "", "", );
        Joueur j1 = new Joueur("Raphaël", "Nadal", "M", "Espagnol", 5);
        Joueur j2 = new Joueur("Novak", "Djokovitc", "M", "Serbe", 1);
        Joueur j3 = new Joueur("A.", "Zverev", "M", "Allemand", 3);
        Joueur j4 = new Joueur("C.", "Alcaraz", "M", "Espagnol", 6);
        Joueur j5 = new Joueur("c.", "Ruud", "M", "Norvégien", 8);
        Joueur j6 = new Joueur("H.", "Rune", "M", "Danemark", 10);
        Joueur j7 = new Joueur("A.", "Rublev", "M", "Russe", 7);
        Joueur j8 = new Joueur("M.", "Cilic", "M", "Croatie", 20);

        //Arbitres
        //Arbitre a1 = new Joueur("", "", "", "");
        //Arbitre a2 = new Joueur("", "", "", "");
        //Arbitre a3 = new Joueur("", "", "", "");
        //Arbitre a4 = new Joueur("", "", "", "");
        //Arbitre a5 = new Joueur("", "", "", "");
        //Arbitre a6 = new Joueur("", "", "", "");
        //Arbitre a7 = new Joueur("", "", "", "");
        //Arbitre a8 = new Joueur("", "", "", "");
        //Arbitre a9 = new Joueur("", "", "", "");
        //Arbitre a10 = new Joueur("", "", "", "");
        //Arbitre a11 = new Joueur("", "", "", "");
        //Arbitre a12 = new Joueur("", "", "", "");
        //Arbitre a13 = new Joueur("", "", "", "");
        //Arbitre a14 = new Joueur("", "", "", "");
        //Arbitre a15 = new Joueur("", "", "", "");
        //Arbitre a16 = new Joueur("", "", "", "");
        //Arbitre a17 = new Joueur("", "", "", "");
        //Arbitre a18 = new Joueur("", "", "", "");
        //Arbitre a19 = new Joueur("", "", "", "");
        //Arbitre a20 = new Joueur("", "", "", "");
        //Arbitre a21 = new Joueur("", "", "", "");
        //Arbitre a22 = new Joueur("", "", "", "");
        //Arbitre a23 = new Joueur("", "", "", "");
        //Arbitre a24 = new Joueur("", "", "", "");
        //Arbitre a25 = new Joueur("", "", "", "");
        //Arbitre a26 = new Joueur("", "", "", "");
        //Arbitre a27 = new Joueur("", "", "", "");
        //Arbitre a28 = new Joueur("", "", "", "");
        //Arbitre a29 = new Joueur("", "", "", "");
        //Arbitre a30 = new Joueur("", "", "", "");
        //Arbitre a31 = new Joueur("", "", "", "");
        //Arbitre a32 = new Joueur("", "", "", "");
        Arbitre a1 = new Arbitre("Jean", "Dujardin", "Français");
        Arbitre a2 = new Arbitre("Tom", "Cruise", "Américain");
        Arbitre a3 = new Arbitre("Tom", "Anderson", "Anglais");
        Arbitre a4 = new Arbitre("Miguel", "Sanchez", "Espagnol");
        Arbitre a5 = new Arbitre("Liam", "Lucas", "Américain");
        Arbitre a6 = new Arbitre("Jonathan", "Mamain", "Américain");
        Arbitre a7 = new Arbitre("Melvin", "Diesel", "Allemand");
        Arbitre a8 = new Arbitre("Luka", "Marais", "Russe");

        //Liste des arbitres de ligne
        List aL1 = new ArrayList();
        aL1.add(a8);
        aL1.add(a2);
        List aL2 = new ArrayList();
        aL2.add(a1);
        aL2.add(a3);
        List aL3 = new ArrayList();
        aL3.add(a2);
        aL3.add(a4);
        List aL4 = new ArrayList();
        aL4.add(a3);
        aL4.add(a5);
        List aL5 = new ArrayList();
        aL5.add(a4);
        aL5.add(a6);
        List aL6 = new ArrayList();
        aL6.add(a5);
        aL6.add(a7);
        List aL7 = new ArrayList();
        aL7.add(a6);
        aL7.add(a8);
        List aL8 = new ArrayList();
        aL8.add(a7);
        aL8.add(a1);

        //Terrains
        Terrain t1 = new Terrain("Principal", 1000);
        Terrain t2 = new Terrain("Secondaire", 500);

        //Matchs
        //Match m1 = new Match("", , "", , , , );
        //Match m2 = new Match("", , "", , , , );
        //Match m3 = new Match("", , "", , , , );
        //Match m4 = new Match("", , "", , , , );
        //Match m5 = new Match("", , "", , , , );
        //Match m6 = new Match("", , "", , , , );
        //Match m7 = new Match("", , "", , , , );
        //Match m8 = new Match("", , "", , , , );
        //Match m9 = new Match("", , "", , , , );
        //Match m10 = new Match("", , "", , , , );
        //Match m11 = new Match("", , "", , , , );
        //Match m12 = new Match("", , "", , , , );
        //Match m13 = new Match("", , "", , , , );
        //Match m14 = new Match("", , "", , , , );
        //Match m15 = new Match("", , "", , , , );
        //Match m16 = new Match("", , "", , , , );
        Match quart1 = new Match("Quart1", t1, "Simple - Homme", j1, j2, a1, aL1);
        Match quart2 = new Match("Quart2", t2, "Simple - Homme", j3, j4, a2, aL2);
        Match quart3 = new Match("Quart3", t1, "Simple - Homme", j5, j6, a3, aL3);
        Match quart4 = new Match("Quart4", t2, "Simple - Homme", j7, j8, a4, aL4);

        //Tests Joueur
        System.out.println("Joueur : \n");
        System.out.format("Nom : %s\n", j1.getNom());
        System.out.format("Prenom : %s\n", j1.getPrenom());
        System.out.format("Natio : %s\n", j1.getNationalite());
        System.out.format("Rang : %s\n", j1.getRang());

        //Tests Arbitre
        System.out.println("\nArbitre :\n");
        System.out.format("Nom : %s\n", a1.getNom());
        System.out.format("Prenom : %s\n", a1.getPrenom());
        System.out.format("Natio : %s\n", a1.getNationalite());

        //Tests listes d'arbitres de ligne
        System.out.println("\nArbitre ligne :\n");
        System.out.format("Premier : %s\n", aL1.get(0));
        System.out.format("Second : %s\n", aL1.get(1));

        //Tests terrain
        System.out.println("\nTerrain :\n");
        System.out.format("Cour : %s\n", t1.getNom());
        System.out.format("Nombre de places : %s\n", t2.getNbPlaces());

        //Tests Match
        System.out.println("\nMatch :\n");
        System.out.format("Tour : %s\n", quart1.getTour());
        System.out.format("Type : %s\n", quart1.getType());

        //Remplissage Match
        jTextFieldJoueur1M1.setText(j1.getNom() + " " + j1.getPrenom() + " (" + j1.getRang() + ")");
        jTextFieldJoueur2M1.setText(j2.getNom() + " " + j2.getPrenom() + " (" + j2.getRang() + ")");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8eme1 = new javax.swing.JPanel();
        jTextFieldJoueur1M1 = new javax.swing.JTextField();
        jTextFieldJoueur2M1 = new javax.swing.JTextField();
        jTextFieldSet5J1M1 = new javax.swing.JTextField();
        jTextFieldSet5J2M1 = new javax.swing.JTextField();
        jTextFieldSet4J1M1 = new javax.swing.JTextField();
        jTextFieldSet4J2M1 = new javax.swing.JTextField();
        jTextFieldSet3J1M1 = new javax.swing.JTextField();
        jTextFieldSet3J2M1 = new javax.swing.JTextField();
        jTextFieldSet2J1M1 = new javax.swing.JTextField();
        jTextFieldSet2J2M1 = new javax.swing.JTextField();
        jTextFieldSet1J1M1 = new javax.swing.JTextField();
        jTextFieldSet1J2M1 = new javax.swing.JTextField();
        jPanel8eme2 = new javax.swing.JPanel();
        jTextFieldJoueur1M2 = new javax.swing.JTextField();
        jTextFieldJoueur2M2 = new javax.swing.JTextField();
        jTextFieldSet5J1M2 = new javax.swing.JTextField();
        jTextFieldSet5J2M2 = new javax.swing.JTextField();
        jTextFieldSet4J1M2 = new javax.swing.JTextField();
        jTextFieldSet4J2M2 = new javax.swing.JTextField();
        jTextFieldSet3J1M2 = new javax.swing.JTextField();
        jTextFieldSet3J2M2 = new javax.swing.JTextField();
        jTextFieldSet2J1M2 = new javax.swing.JTextField();
        jTextFieldSet2J2M2 = new javax.swing.JTextField();
        jTextFieldSet1J1M2 = new javax.swing.JTextField();
        jTextFieldSet1J2M2 = new javax.swing.JTextField();
        jFrameSaisieScores = new javax.swing.JInternalFrame();
        jComboBoxMatch = new javax.swing.JComboBox<>();
        jTextFieldJoueur1 = new javax.swing.JTextField();
        jTextFieldJoueur2 = new javax.swing.JTextField();
        jTextFieldJ1Set1 = new javax.swing.JTextField();
        jTextFieldJ2Set1 = new javax.swing.JTextField();
        jTextFieldJ1Set2 = new javax.swing.JTextField();
        jTextFieldJ2Set2 = new javax.swing.JTextField();
        jTextFieldJ1Set3 = new javax.swing.JTextField();
        jTextFieldJ2Set3 = new javax.swing.JTextField();
        jTextFieldJ1Set4 = new javax.swing.JTextField();
        jTextFieldJ2Set4 = new javax.swing.JTextField();
        jTextFieldJ1Set5 = new javax.swing.JTextField();
        jTextFieldJ2Set5 = new javax.swing.JTextField();
        jLabelMatch = new javax.swing.JLabel();
        jLabelJoueurs = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelScores = new javax.swing.JLabel();
        jLabelSet1 = new javax.swing.JLabel();
        jLabelSet2 = new javax.swing.JLabel();
        jLabelSet3 = new javax.swing.JLabel();
        jLabelSet4 = new javax.swing.JLabel();
        jLabelSet5 = new javax.swing.JLabel();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jFrameModifMatch = new javax.swing.JInternalFrame();
        jLabelMMMatch1 = new javax.swing.JLabel();
        jComboBoxMMMatch = new javax.swing.JComboBox<>();
        jLabelMMJoueurs = new javax.swing.JLabel();
        jComboBoxJoueur1 = new javax.swing.JComboBox<>();
        jComboBoxJoueur2 = new javax.swing.JComboBox<>();
        jLabelMMTerrain = new javax.swing.JLabel();
        jComboBoxTerrain = new javax.swing.JComboBox<>();
        jLabelArbitreP = new javax.swing.JLabel();
        jLabelArbitreL = new javax.swing.JLabel();
        jComboBoxArbitreL2 = new javax.swing.JComboBox<>();
        jComboBoxArbitreL3 = new javax.swing.JComboBox<>();
        jComboBoxArbitreL4 = new javax.swing.JComboBox<>();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuAjouter = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuMatch = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1800, 860));

        jPanel8eme1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8eme1.setMaximumSize(new java.awt.Dimension(400, 75));
        jPanel8eme1.setMinimumSize(new java.awt.Dimension(400, 75));

        jTextFieldJoueur1M1.setEditable(false);
        jTextFieldJoueur1M1.setText("Joueur 1");

        jTextFieldJoueur2M1.setEditable(false);
        jTextFieldJoueur2M1.setText("Joueur 2");

        jTextFieldSet5J1M1.setEditable(false);
        jTextFieldSet5J1M1.setText("set 5");

        jTextFieldSet5J2M1.setEditable(false);
        jTextFieldSet5J2M1.setText("set 5");

        jTextFieldSet4J1M1.setEditable(false);
        jTextFieldSet4J1M1.setText("set 4");

        jTextFieldSet4J2M1.setEditable(false);
        jTextFieldSet4J2M1.setText("set 4");

        jTextFieldSet3J1M1.setEditable(false);
        jTextFieldSet3J1M1.setText("set 3");

        jTextFieldSet3J2M1.setEditable(false);
        jTextFieldSet3J2M1.setText("set 3");

        jTextFieldSet2J1M1.setEditable(false);
        jTextFieldSet2J1M1.setText("set 2");

        jTextFieldSet2J2M1.setEditable(false);
        jTextFieldSet2J2M1.setText("set 2");

        jTextFieldSet1J1M1.setEditable(false);
        jTextFieldSet1J1M1.setText("set 1");

        jTextFieldSet1J2M1.setEditable(false);
        jTextFieldSet1J2M1.setText("set 1");

        javax.swing.GroupLayout jPanel8eme1Layout = new javax.swing.GroupLayout(jPanel8eme1);
        jPanel8eme1.setLayout(jPanel8eme1Layout);
        jPanel8eme1Layout.setHorizontalGroup(
            jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8eme1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldJoueur2M1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jTextFieldJoueur1M1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8eme1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSet1J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet2J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet3J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet4J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet5J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8eme1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSet1J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet2J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet3J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet4J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet5J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8eme1Layout.setVerticalGroup(
            jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8eme1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJoueur1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet5J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet4J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet3J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet2J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet1J1M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel8eme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJoueur2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet5J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet4J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet3J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet2J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet1J2M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8eme2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8eme2.setMaximumSize(new java.awt.Dimension(400, 75));
        jPanel8eme2.setMinimumSize(new java.awt.Dimension(400, 75));

        jTextFieldJoueur1M2.setEditable(false);
        jTextFieldJoueur1M2.setText("Joueur 1");

        jTextFieldJoueur2M2.setEditable(false);
        jTextFieldJoueur2M2.setText("Joueur 2");

        jTextFieldSet5J1M2.setEditable(false);
        jTextFieldSet5J1M2.setText("set 5");

        jTextFieldSet5J2M2.setEditable(false);
        jTextFieldSet5J2M2.setText("set 5");

        jTextFieldSet4J1M2.setEditable(false);
        jTextFieldSet4J1M2.setText("set 4");

        jTextFieldSet4J2M2.setEditable(false);
        jTextFieldSet4J2M2.setText("set 4");

        jTextFieldSet3J1M2.setEditable(false);
        jTextFieldSet3J1M2.setText("set 3");

        jTextFieldSet3J2M2.setEditable(false);
        jTextFieldSet3J2M2.setText("set 3");

        jTextFieldSet2J1M2.setEditable(false);
        jTextFieldSet2J1M2.setText("set 2");

        jTextFieldSet2J2M2.setEditable(false);
        jTextFieldSet2J2M2.setText("set 2");

        jTextFieldSet1J1M2.setEditable(false);
        jTextFieldSet1J1M2.setText("set 1");

        jTextFieldSet1J2M2.setEditable(false);
        jTextFieldSet1J2M2.setText("set 1");

        javax.swing.GroupLayout jPanel8eme2Layout = new javax.swing.GroupLayout(jPanel8eme2);
        jPanel8eme2.setLayout(jPanel8eme2Layout);
        jPanel8eme2Layout.setHorizontalGroup(
            jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8eme2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldJoueur2M2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jTextFieldJoueur1M2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8eme2Layout.createSequentialGroup()
                        .addComponent(jTextFieldSet1J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet2J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet3J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet4J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet5J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8eme2Layout.createSequentialGroup()
                        .addComponent(jTextFieldSet1J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet2J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet3J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet4J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSet5J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8eme2Layout.setVerticalGroup(
            jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8eme2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJoueur1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet5J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet4J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet3J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet2J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet1J1M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel8eme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJoueur2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet5J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet4J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet3J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet2J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSet1J2M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jFrameSaisieScores.setTitle("Saisie des scores");
        jFrameSaisieScores.setToolTipText("");
        jFrameSaisieScores.setMaximumSize(new java.awt.Dimension(500, 500));
        jFrameSaisieScores.setMinimumSize(new java.awt.Dimension(350, 350));
        jFrameSaisieScores.setPreferredSize(new java.awt.Dimension(350, 350));
        jFrameSaisieScores.setVisible(true);

        jComboBoxMatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Match 1", "Match 2", "Match 3", "Match 4" }));

        jTextFieldJoueur1.setEditable(false);
        jTextFieldJoueur1.setText("Joueur 1");
        jTextFieldJoueur1.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJoueur1.setMinimumSize(new java.awt.Dimension(71, 22));
        jTextFieldJoueur1.setPreferredSize(new java.awt.Dimension(71, 22));

        jTextFieldJoueur2.setEditable(false);
        jTextFieldJoueur2.setText("Joueur 2");
        jTextFieldJoueur2.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJoueur2.setMinimumSize(new java.awt.Dimension(71, 22));
        jTextFieldJoueur2.setPreferredSize(new java.awt.Dimension(71, 22));

        jTextFieldJ1Set1.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set1.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ2Set1.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set1.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ1Set2.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set2.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ2Set2.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set2.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ1Set3.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set3.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ2Set3.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set3.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ1Set4.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set4.setMinimumSize(new java.awt.Dimension(71, 22));

        jTextFieldJ2Set4.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set4.setMinimumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set4.setPreferredSize(new java.awt.Dimension(71, 22));

        jTextFieldJ1Set5.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set5.setMinimumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ1Set5.setPreferredSize(new java.awt.Dimension(71, 22));

        jTextFieldJ2Set5.setMaximumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set5.setMinimumSize(new java.awt.Dimension(71, 22));
        jTextFieldJ2Set5.setPreferredSize(new java.awt.Dimension(71, 22));

        jLabelMatch.setText("Match :");
        jLabelMatch.setToolTipText("");

        jLabelJoueurs.setText("Joueurs :");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMaximumSize(new java.awt.Dimension(276, 6));
        jSeparator1.setMinimumSize(new java.awt.Dimension(276, 6));
        jSeparator1.setPreferredSize(new java.awt.Dimension(276, 6));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(276, 6));

        jLabelScores.setText("Scores :");

        jLabelSet1.setText("Set 1");

        jLabelSet2.setText("Set 2");

        jLabelSet3.setText("Set 3");

        jLabelSet4.setText("Set 4");

        jLabelSet5.setText("Set 5");

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameSaisieScoresLayout = new javax.swing.GroupLayout(jFrameSaisieScores.getContentPane());
        jFrameSaisieScores.getContentPane().setLayout(jFrameSaisieScoresLayout);
        jFrameSaisieScoresLayout.setHorizontalGroup(
            jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                        .addComponent(jLabelScores)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSaisieScoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSaisieScoresLayout.createSequentialGroup()
                                .addComponent(jLabelMatch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSaisieScoresLayout.createSequentialGroup()
                                .addComponent(jButtonValider)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAnnuler)
                                .addGap(94, 94, 94))))
                    .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSet1)
                                    .addComponent(jLabelSet2)
                                    .addComponent(jLabelSet3)
                                    .addComponent(jLabelSet4)
                                    .addComponent(jLabelSet5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldJ1Set4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ1Set1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ1Set2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ1Set3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ1Set5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldJ2Set5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ2Set4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ2Set3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ2Set2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJ2Set1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSaisieScoresLayout.createSequentialGroup()
                                .addComponent(jLabelJoueurs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jFrameSaisieScoresLayout.setVerticalGroup(
            jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSaisieScoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatch))
                .addGap(18, 18, 18)
                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJoueurs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelScores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJ2Set1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldJ1Set1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJ2Set2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJ2Set3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJ2Set4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJ2Set5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameSaisieScoresLayout.createSequentialGroup()
                        .addComponent(jLabelSet1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJ1Set2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSet2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJ1Set3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSet3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJ1Set4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSet4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJ1Set5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSet5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrameSaisieScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValider)
                    .addComponent(jButtonAnnuler))
                .addContainerGap())
        );

        jFrameModifMatch.setTitle("Modification d'un Match");
        jFrameModifMatch.setToolTipText("");
        jFrameModifMatch.setMaximumSize(new java.awt.Dimension(500, 500));
        jFrameModifMatch.setMinimumSize(new java.awt.Dimension(350, 350));
        jFrameModifMatch.setPreferredSize(new java.awt.Dimension(350, 350));
        jFrameModifMatch.setVisible(true);

        jLabelMMMatch1.setText("Match :");
        jLabelMMMatch1.setToolTipText("");

        jComboBoxMMMatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Match 1", "Match 2", "Match 3", "Match 4" }));

        jLabelMMJoueurs.setText("Joueurs :");

        jComboBoxJoueur1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Joueur 1", "Joueur 2", "Joueur 3", "Joueur 4" }));

        jComboBoxJoueur2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Joueur 1", "Joueur 2", "Joueur 3", "Joueur4" }));
        jComboBoxJoueur2.setSelectedIndex(1);

        jLabelMMTerrain.setText("Terrain :");

        jComboBoxTerrain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terrain 1", "Terrain 2", "Terrain 3", "Terrain 4" }));

        jLabelArbitreP.setText("Arbitre Principal :");

        jLabelArbitreL.setText("Arbitres de lignes :");

        jComboBoxArbitreL2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre 1", "Arbitre 2", "Arbitre 3", "Arbitre 4" }));

        jComboBoxArbitreL3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre 1", "Arbitre 2", "Arbitre 3", "Arbitre 4" }));
        jComboBoxArbitreL3.setSelectedIndex(1);

        jComboBoxArbitreL4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre 1", "Arbitre 2", "Arbitre 3", "Arbitre 4" }));
        jComboBoxArbitreL4.setSelectedIndex(2);

        javax.swing.GroupLayout jFrameModifMatchLayout = new javax.swing.GroupLayout(jFrameModifMatch.getContentPane());
        jFrameModifMatch.getContentPane().setLayout(jFrameModifMatchLayout);
        jFrameModifMatchLayout.setHorizontalGroup(
            jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameModifMatchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameModifMatchLayout.createSequentialGroup()
                        .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jFrameModifMatchLayout.createSequentialGroup()
                                .addComponent(jLabelMMTerrain)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTerrain, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrameModifMatchLayout.createSequentialGroup()
                                .addComponent(jLabelMMMatch1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxMMMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrameModifMatchLayout.createSequentialGroup()
                                .addComponent(jLabelMMJoueurs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameModifMatchLayout.createSequentialGroup()
                        .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrameModifMatchLayout.createSequentialGroup()
                                .addComponent(jLabelArbitreP)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBoxArbitreL2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrameModifMatchLayout.createSequentialGroup()
                                .addComponent(jLabelArbitreL)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxArbitreL3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxArbitreL4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jFrameModifMatchLayout.setVerticalGroup(
            jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameModifMatchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMMMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMMMatch1))
                .addGap(18, 18, 18)
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMMJoueurs)
                    .addComponent(jComboBoxJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMMTerrain)
                    .addComponent(jComboBoxTerrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArbitreP)
                    .addComponent(jComboBoxArbitreL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameModifMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArbitreL)
                    .addComponent(jComboBoxArbitreL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArbitreL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jMenuFichier.setText("Fichier");
        jMenuBar.add(jMenuFichier);

        jMenuAjouter.setText("Ajouter ...");

        jMenuItem1.setText("un Joueur");
        jMenuAjouter.add(jMenuItem1);

        jMenuItem2.setText("un Arbitre");
        jMenuAjouter.add(jMenuItem2);

        jMenuBar.add(jMenuAjouter);

        jMenuMatch.setText("Match");

        jMenuItem3.setText("Modifier un Match");
        jMenuMatch.add(jMenuItem3);

        jMenuItem4.setText("Saisie des scores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuMatch.add(jMenuItem4);

        jMenuBar.add(jMenuMatch);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8eme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jFrameModifMatch, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jFrameSaisieScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8eme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1009, 1009, 1009))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFrameSaisieScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(837, 837, 837))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8eme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8eme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jFrameModifMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(655, 655, 655))))
        );

        try {
            jFrameSaisieScores.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        try {
            jFrameModifMatch.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jFrameSaisieScores.setVisible(true);
        jFrameSaisieScores.setSize(300, 300);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        //Récupération du score
        /*String j1Set1 = jTextFieldJ1Set1.getText();
        String j1Set2 = jTextFieldJ1Set2.getText();
        String j1Set3 = jTextFieldJ1Set3.getText();
        String j1Set4 = jTextFieldJ1Set4.getText();
        String j1Set5 = jTextFieldJ1Set5.getText();
        String j2Set1 = jTextFieldJ2Set1.getText();
        String j2Set2 = jTextFieldJ2Set2.getText();
        String j2Set3 = jTextFieldJ2Set3.getText();
        String j2Set4 = jTextFieldJ2Set4.getText();
        String j2Set5 = jTextFieldJ2Set5.getText();*/
        
        int j1Set1 = Integer.parseInt(jTextFieldJ1Set1.getText());
        int j2Set1 = Integer.parseInt(jTextFieldJ2Set1.getText());
        int[] set1 = {j1Set1, j2Set1};
        quart1.setScoreMatch(set1, 1);
        String j1Set2 = jTextFieldJ1Set2.getText();
        String j1Set3 = jTextFieldJ1Set3.getText();
        String j1Set4 = jTextFieldJ1Set4.getText();
        String j1Set5 = jTextFieldJ1Set5.getText();
        String j2Set2 = jTextFieldJ2Set2.getText();
        String j2Set3 = jTextFieldJ2Set3.getText();
        String j2Set4 = jTextFieldJ2Set4.getText();
        String j2Set5 = jTextFieldJ2Set5.getText();
        
        //Affichage dans l'arborescence
        jTextFieldSet1J1M1.setText(j1Set1+"");
        jTextFieldSet2J1M1.setText(j1Set2);
        jTextFieldSet3J1M1.setText(j1Set3);
        jTextFieldSet4J1M1.setText(j1Set4);
        jTextFieldSet5J1M1.setText(j1Set5);
        jTextFieldSet1J2M1.setText(j2Set1 +"");
        jTextFieldSet2J2M1.setText(j2Set2);
        jTextFieldSet3J2M1.setText(j2Set3);
        jTextFieldSet4J2M1.setText(j2Set4);
        jTextFieldSet5J2M1.setText(j2Set5);
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxArbitreL2;
    private javax.swing.JComboBox<String> jComboBoxArbitreL3;
    private javax.swing.JComboBox<String> jComboBoxArbitreL4;
    private javax.swing.JComboBox<String> jComboBoxJoueur1;
    private javax.swing.JComboBox<String> jComboBoxJoueur2;
    private javax.swing.JComboBox<String> jComboBoxMMMatch;
    private javax.swing.JComboBox<String> jComboBoxMatch;
    private javax.swing.JComboBox<String> jComboBoxTerrain;
    private javax.swing.JInternalFrame jFrameModifMatch;
    private javax.swing.JInternalFrame jFrameSaisieScores;
    private javax.swing.JLabel jLabelArbitreL;
    private javax.swing.JLabel jLabelArbitreP;
    private javax.swing.JLabel jLabelJoueurs;
    private javax.swing.JLabel jLabelMMJoueurs;
    private javax.swing.JLabel jLabelMMMatch1;
    private javax.swing.JLabel jLabelMMTerrain;
    private javax.swing.JLabel jLabelMatch;
    private javax.swing.JLabel jLabelScores;
    private javax.swing.JLabel jLabelSet1;
    private javax.swing.JLabel jLabelSet2;
    private javax.swing.JLabel jLabelSet3;
    private javax.swing.JLabel jLabelSet4;
    private javax.swing.JLabel jLabelSet5;
    private javax.swing.JMenu jMenuAjouter;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuMatch;
    private javax.swing.JPanel jPanel8eme1;
    private javax.swing.JPanel jPanel8eme2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldJ1Set1;
    private javax.swing.JTextField jTextFieldJ1Set2;
    private javax.swing.JTextField jTextFieldJ1Set3;
    private javax.swing.JTextField jTextFieldJ1Set4;
    private javax.swing.JTextField jTextFieldJ1Set5;
    private javax.swing.JTextField jTextFieldJ2Set1;
    private javax.swing.JTextField jTextFieldJ2Set2;
    private javax.swing.JTextField jTextFieldJ2Set3;
    private javax.swing.JTextField jTextFieldJ2Set4;
    private javax.swing.JTextField jTextFieldJ2Set5;
    private javax.swing.JTextField jTextFieldJoueur1;
    private javax.swing.JTextField jTextFieldJoueur1M1;
    private javax.swing.JTextField jTextFieldJoueur1M2;
    private javax.swing.JTextField jTextFieldJoueur2;
    private javax.swing.JTextField jTextFieldJoueur2M1;
    private javax.swing.JTextField jTextFieldJoueur2M2;
    private javax.swing.JTextField jTextFieldSet1J1M1;
    private javax.swing.JTextField jTextFieldSet1J1M2;
    private javax.swing.JTextField jTextFieldSet1J2M1;
    private javax.swing.JTextField jTextFieldSet1J2M2;
    private javax.swing.JTextField jTextFieldSet2J1M1;
    private javax.swing.JTextField jTextFieldSet2J1M2;
    private javax.swing.JTextField jTextFieldSet2J2M1;
    private javax.swing.JTextField jTextFieldSet2J2M2;
    private javax.swing.JTextField jTextFieldSet3J1M1;
    private javax.swing.JTextField jTextFieldSet3J1M2;
    private javax.swing.JTextField jTextFieldSet3J2M1;
    private javax.swing.JTextField jTextFieldSet3J2M2;
    private javax.swing.JTextField jTextFieldSet4J1M1;
    private javax.swing.JTextField jTextFieldSet4J1M2;
    private javax.swing.JTextField jTextFieldSet4J2M1;
    private javax.swing.JTextField jTextFieldSet4J2M2;
    private javax.swing.JTextField jTextFieldSet5J1M1;
    private javax.swing.JTextField jTextFieldSet5J1M2;
    private javax.swing.JTextField jTextFieldSet5J2M1;
    private javax.swing.JTextField jTextFieldSet5J2M2;
    // End of variables declaration//GEN-END:variables
}
