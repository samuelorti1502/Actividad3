package Clases;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel David Ortiz
 */
public class Preguntas {
    
    private String pregunta;
    
    public Preguntas(){
        
    }
    
    public void mensaje(String pregunta, int x){
        setPregunta(pregunta);
        JOptionPane.showMessageDialog(null, getPregunta(), "Pregunta " + x, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
}
