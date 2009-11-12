/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package turingmachine.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tchandy
 */
public class SelecionadorTableModel extends DefaultTableModel{
    private List lista;

    public SelecionadorTableModel(List lista) {
        this.lista = lista;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    
    
}
