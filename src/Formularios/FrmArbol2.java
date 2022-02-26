/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.DynamicTxt1;
import Clases.Preguntas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Samuel David Ortiz
 */
public class FrmArbol2 {

    private Preguntas pregunta = new Preguntas();

    private JFrame frame;
    private JPanel tituloPanel;
    private JPanel btnPanel;
    private JPanel mainPanel;

    private JButton btnPregunta[];

    private ImageIcon Img;
    private Icon icono;

    private final String[] preguntas = {"Pregunta 1", "Pregunta 2", "Pregunta 3", "Pregunta 4", "Pregunta 5", "Pregunta 6",
        "Pregunta 7", "Pregunta 8", "Pregunta 9", "Pregunta 10", "Pregunta 11", "Pregunta 12",
        "Pregunta 13", "Pregunta 14", "Pregunta 15", "Pregunta 16", "Pregunta 17"};

    public static void main(String[] args) {
        new FrmArbol2().buildGUI();
    }

    public void buildGUI() {
        setFrame(new JFrame("Arbol"));
        getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTituloPanel(new JPanel());

        // <editor-fold defaultstate="collapsed" desc="Escudo UMG">
        JLabel lblTitulo = new JLabel();
        lblTitulo.setSize(140, 140);
        lblTitulo.setLocation(5, 5);
        Img = new ImageIcon(getClass().getResource("/images/umg.png"));
        //Img = new ImageIcon("./src/images/umg.png");
        icono = new ImageIcon(Img.getImage().getScaledInstance(140, 140,
                Image.SCALE_DEFAULT));

        lblTitulo.setIcon(icono);
        lblTitulo.setVisible(true);
        getTituloPanel().add(lblTitulo, 0);
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="Texto dinamico">
        JLabel lblTexto = new JLabel();
        getTituloPanel().add(lblTexto, 0);
        //tituloPanel.add(txtPanel,0);
        String mensaje = "BIENVENIDO AL ARBOL DE SDOM 2022";
        DynamicTxt1 texto = null;
        try {
            texto = new DynamicTxt1(mensaje, 300, lblTexto, new JLabel());
        } catch (Exception ex) {
            System.out.println("Error");
            Logger.getLogger(DynamicTxt1.class.getName()).log(Level.SEVERE, null, ex);
        }
        texto.start();
        // </editor-fold>  

        BorderLayout layout = new BorderLayout();
        JPanel bg = new JPanel(layout);
        bg.setOpaque(true);
        bg.setBackground(Color.decode("#5064F7"));

        //btnPreguntas = new ArrayList<JButton>();
        GridLayout btnGrid = new GridLayout(9, 2);
        btnGrid.setHgap(5);
        btnGrid.setVgap(5);

        setBtnPanel(new JPanel(btnGrid));

        setBtnPregunta(new JButton[preguntas.length]);

        for (int i = 0; i < getBtnPregunta().length; i++) {
            getBtnPregunta()[i] = new JButton();

            getBtnPregunta()[i].setText(preguntas[i]);

            getBtnPanel().add(getBtnPregunta()[i]);

            getBtnPregunta()[i].addActionListener(new MisPreguntas());
        }

        setMainPanel(new JPanel());

        // <editor-fold defaultstate="collapsed" desc="Imagen arbol">
        JLabel lblArbol = new JLabel();
        lblArbol.setSize(700, 500);
        lblArbol.setLocation(5, 5);
        Img = new ImageIcon(getClass().getResource("/images/arbol.gif"));
        icono = new ImageIcon(Img.getImage().getScaledInstance(650, 500,
                Image.SCALE_DEFAULT));

        lblArbol.setIcon(icono);
        lblArbol.setVisible(true);
        getMainPanel().add(lblArbol, 0);
        // </editor-fold>  

        bg.add(BorderLayout.NORTH, getTituloPanel());
        bg.add(BorderLayout.EAST, getBtnPanel());
        bg.add(BorderLayout.CENTER, getMainPanel());

        getFrame().add(bg);

        int frameWidth = 900;
        int frameHeight = 700;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        getFrame().setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);
        //frame.pack();
        getFrame().setLocationRelativeTo(bg);
        getFrame().setVisible(true);
        
        Img = new ImageIcon(getClass().getResource("/images/arbolicon.ico"));
        frame.setIconImage(Img.getImage());
    }

    /**
     * @return the tituloPanel
     */
    public JPanel getTituloPanel() {
        return tituloPanel;
    }

    /**
     * @param tituloPanel the tituloPanel to set
     */
    public void setTituloPanel(JPanel tituloPanel) {
        this.tituloPanel = tituloPanel;
    }

    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * @return the btnPanel
     */
    public JPanel getBtnPanel() {
        return btnPanel;
    }

    /**
     * @param btnPanel the btnPanel to set
     */
    public void setBtnPanel(JPanel btnPanel) {
        this.btnPanel = btnPanel;
    }

    /**
     * @return the pregunta
     */
    public Preguntas getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(Preguntas pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the btnPregunta
     */
    public JButton[] getBtnPregunta() {
        return btnPregunta;
    }

    /**
     * @param btnPregunta the btnPregunta to set
     */
    public void setBtnPregunta(JButton[] btnPregunta) {
        this.btnPregunta = btnPregunta;
    }

    /**
     * @return the mainPanel
     */
    public JPanel getMainPanel() {
        return mainPanel;
    }

    /**
     * @param mainPanel the mainPanel to set
     */
    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public class MisPreguntas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {

            File abre = new File("./preguntas.txt");
            int xx = 0;

            try {
                if (abre != null) {
                    Scanner scan = new Scanner(abre);
                    ArrayList<String> data = new ArrayList<String>();

                    while (scan.hasNextLine()) {
                        //btnPreguntas.add(xx);
                        String c;
                        c = scan.nextLine();
                        int l = c.length();
                        int z[] = new int[l];
                        String x[] = new String[l];

                        x = c.split(",");

                        data.add(x[0]);
                        //System.out.println(x[0]);

                        if (a.getSource() == getBtnPregunta()[xx]) {

                            getPregunta().mensaje(x[0] + "\n" + x[1], xx);
                        }

                        xx++;

                    }
                }

            } catch (Exception e) {
            }

            /*for (int i = 0; i < preguntas.length; i++) {

                if (a.getSource() == btnPregunta[i]) {
                    System.out.println("Hola " + i);
                }

            }*/
        }
    }

}
