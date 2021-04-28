/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_interfaces.dao;

import java.util.List;
import sn.supinfo.miniprojet_classes.Etudiant;
import sn.supinfo.miniprojet_classes.Groupe;

/**
 *
 * @author MHDN
 */
public interface IEtudiant {
    public void addEtudiant(Etudiant etudiant);
    public void updateEtudiant(Etudiant etudiant);
    public Etudiant getEtudiantById(int i);
    public void removeEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiant();
}
