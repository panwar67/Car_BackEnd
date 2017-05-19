/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models_caring;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Panwar
 */
public class Service_Renderer extends JLabel implements ListCellRenderer<Service_Model> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Service_Model> list, 
            Service_Model value, int index, boolean isSelected, boolean cellHasFocus) {
            
        String service_name = value.getSERVE_NAME();
        //System.out.println(""+service_name+" "+value.getSERVE_CODE());
        setText(value.getSERVE_NAME());
        if (isSelected) {
            setBackground(Color.GRAY);
            setForeground(Color.RED);
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
       
        return this;
    }
    
    public Service_Renderer() {
    }
    
    
    
}
