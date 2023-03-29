/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MESNARD SAUVERZAC Emrys
 */
public class Modele extends AbstractListModel implements ComboBoxModel {
    
    private List<String> data = new ArrayList<>();
    private String selectedItem;
    
    public void ajouterElement(String nomElem){
        data.add(nomElem);
    }
     
    public void initialisation() {
        data.add("--Veuillez sélectionner--");
    }
    
    public void vider(){
        data.clear();
        data.add("--Veuillez sélectionner--");
        selectedItem = "--Veuillez sélectionner--";
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public String getElementAt(int index) {
        return data.get(index);
    }
    @Override
    public String getSelectedItem() {
        return selectedItem;
    }

    @Override
    public void setSelectedItem(Object anItem){
       selectedItem = (String) anItem;
    }
}
