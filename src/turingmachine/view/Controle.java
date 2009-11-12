/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package turingmachine.view;

import java.util.ArrayList;

/**
 *
 * @author tchandy
 */
public class Controle {
    private ArrayList<String> alfabetoEntrada  = new ArrayList<String>();
    private ArrayList<String> alfabetoTrabalho = new ArrayList<String>();
    private ArrayList<String> contextInicial = new ArrayList<String>();
    private ArrayList<String> contextFinal = new ArrayList<String>();

    public ArrayList<String> getAlfabetoEntrada() {
        return alfabetoEntrada;
    }

    public void setAlfabetoEntrada(ArrayList<String> alfabetoEntrada) {
        this.alfabetoEntrada = alfabetoEntrada;
    }

    public ArrayList<String> getAlfabetoTrabalho() {
        return alfabetoTrabalho;
    }

    public void setAlfabetoTrabalho(ArrayList<String> alfabetoTrabalho) {
        this.alfabetoTrabalho = alfabetoTrabalho;
    }

    public ArrayList<String> getContextFinal() {
        return contextFinal;
    }

    public void setContextFinal(ArrayList<String> contextFinal) {
        this.contextFinal = contextFinal;
    }

    public ArrayList<String> getContextInicial() {
        return contextInicial;
    }

    public void setContextInicial(ArrayList<String> contextInicial) {
        this.contextInicial = contextInicial;
    }

    
    

}
