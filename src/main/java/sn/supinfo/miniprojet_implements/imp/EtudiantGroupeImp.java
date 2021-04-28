/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_implements.imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.miniprojet_classes.Etudiant;
import sn.supinfo.miniprojet_classes.Groupe;
import sn.supinfo.miniprojet_interfaces.dao.IEtudiantGroupe;

/**
 *
 * @author MHDN
 */
public class EtudiantGroupeImp implements IEtudiantGroupe {

ArrayList<Groupe> etudiants=new ArrayList<>();
    @Override
    public void addEtudiantGroupe(Groupe groupe) {
       etudiants.add(groupe);
    }
    @Override
    public void removeEtudiant(Groupe groupe) {
     etudiants.remove(groupe);
    }

    public void removeEtudiantGroupe(Etudiant etudiantgroupe) {
       etudiants.remove(etudiantgroupe);
    }

    @Override
    public Groupe getEtudiantById(int i) {
         for(Groupe etudiant:etudiants){
            if(etudiant.getId_groupe()==i){
                return etudiant;
                
            }
         }
    return null;
        
    }

    @Override
    public List<Groupe> getAllEtudiantGroupe() {
        
       return etudiants;
        
    }
    
  
}
