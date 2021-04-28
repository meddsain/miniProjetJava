/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_implements.imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.miniprojet_classes.Etudiant;
import sn.supinfo.miniprojet_classes.EtudiantGroupe;
import sn.supinfo.miniprojet_classes.Groupe;
import sn.supinfo.miniprojet_interfaces.dao.IGroupe;

/**
 *
 * @author MHDN
 */
public class GroupeImp implements IGroupe{

    public static Etudiant getEtudiantById(int idGroupe1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    ArrayList<Groupe> groupes=new ArrayList<>();
    
    @Override
    public void addGroupe(Groupe groupe){
        groupes.add(groupe);
        
        
    }

    @Override 
    public void updateGroupe(Groupe groupe) {
        
         for(Groupe groupe2:groupes){
            if(groupe2.getId_groupe()==groupe.getId_groupe()){
                
                groupe2.setNom_groupe(groupe.getNom_Groupe());
                groupe2.setDate_creation(groupe.getDate_creation());
                groupe2.setModule_groupe(groupe.getModule_groupe());
            }
       
        }
    }

    @Override
    public Groupe getGroupeById(int i) {
        for(Groupe groupe:groupes){
            if(groupe.getId_groupe()==i){
            return groupe;
            }
        }  
        return null;
    }

    @Override
    public void removeGroupe(Groupe groupe) {
        groupes.remove(groupe);
       
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupes;
       
    }

    public void addEtudiantGroupe(EtudiantGroupe groupe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
