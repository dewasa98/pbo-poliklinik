/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TambahPeriksa;
/**
 *
 * @author Mahmud
 */
public class ControllerTambahPeriksa implements ActionListener{

    private TambahPeriksa view;
    
    public ControllerTambahPeriksa(){
        view = new TambahPeriksa();
        view.addListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnAdd())) {
            
        } else if (source.equals(view.getBtnBack())) {
            ControllerPilihan cp = new ControllerPilihan();
            view.dispose();
        }
    }
    
}
