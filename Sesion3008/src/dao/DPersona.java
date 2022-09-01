/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Persona;
import modelos.SEXO;

/**
 *
 * @author labc205
 */
public class DPersona {
    private ArrayList<Persona> listPersona = new ArrayList<>();

    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public DPersona() {
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
    
    public int agregarPersona(int id, String nom, String ape,
            String email, SEXO sexo) {
        
        int b = 0;
        Persona pers = new Persona(id, nom, ape, email, sexo);
        listPersona.add(pers);
        b = 1;
        return b;
    }
    
    public DefaultTableModel getListPers() {
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] = {"ID", "NOMBRES", "APELLIDOS", "EMAIL", "SEXO"};
        
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        for (Persona pers: listPersona) {
            String reg[] = new String[5];
            reg[0] = "" + pers.getCodigo();
            reg[1] = pers.getNombre();
            reg[2] = pers.getApellidos();
            reg[3] = pers.getEmail();
            reg[4] = "" + pers.getSexo();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
}
