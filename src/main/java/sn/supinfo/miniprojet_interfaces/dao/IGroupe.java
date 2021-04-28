/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.miniprojet_interfaces.dao;

import java.util.List;
import sn.supinfo.miniprojet_classes.Groupe;

/**
 *
 * @author MHDN
 */
public interface IGroupe {
    
    public void addGroupe(Groupe groupe);
    public void updateGroupe(Groupe groupe);
    public Groupe getGroupeById(int i);
    public void removeGroupe(Groupe groupe);
    public List<Groupe> getAllGroupe();
}
