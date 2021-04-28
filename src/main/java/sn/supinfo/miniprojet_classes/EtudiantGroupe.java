/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_classes;

/**
 *
 * @author MHDN
 */
public class EtudiantGroupe {
    private int idEtudiant;
    private String prenom;
    private String nom;
    private String numeroEtudiant;
    private String departement;
    private String dateNaissance;

    public EtudiantGroupe(int idEtudiant, String prenom, String nom, String numeroEtudiant, String departement, String dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.prenom = prenom;
        this.nom = nom;
        this.numeroEtudiant = numeroEtudiant;
        this.departement = departement;
        this.dateNaissance = dateNaissance;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    

    
}
