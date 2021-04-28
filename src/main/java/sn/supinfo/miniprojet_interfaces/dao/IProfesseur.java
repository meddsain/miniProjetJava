/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_interfaces.dao;

import java.util.List;
import sn.supinfo.miniprojet_classes.Professeur;

/**
 *
 * @author MHDN
 */
public interface IProfesseur {
     public void addProfesseur(Professeur professeur);
     public void updateProfesseur(Professeur professeur);
     public Professeur getProfesseurById(int i);
     public void removeProfesseur(Professeur professeur);
     public List<Professeur> getAllProfesseur();
    
}
